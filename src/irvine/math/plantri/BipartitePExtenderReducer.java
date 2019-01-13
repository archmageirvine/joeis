package irvine.math.plantri;

import irvine.math.MutableInteger;

/**
 * Implementation of the P-operation in Batagelj's paper.
 * @author Gunnar Brinkmann
 * @author Brendan McKay
 * @author Sean A. Irvine
 */
public class BipartitePExtenderReducer implements ExtenderReducer {

  private final PlantriGraphState mState;

  /* This routine is the implementation of the P-operation in Batagelj's paper.
     It inserts two new vertices -- mState.mNumVertices and mState.mNumVertices+1. The reference edge ref is
     the one starting at the vertex to be split that will (always) become a
     valency 4 vertex neighbouring the one in the center.
  
  
         a
        / \
    ---b---c---e  The edge c-.e is the reference edge
        \ /
         d
  
  The operations can only be understood by drawing a picture containing the edge
  numbers as initialized in init_P_op().
  */
  
  BipartitePExtenderReducer(final PlantriGraphState state) {
    mState = state;
  }

  @Override
  public Edge extend(final Edge ref) {
    final Edge[] edges = mState.mEdges;
    final Edge[] firstEdge = mState.mFirstEdge;
    final int[] degree = mState.mDegree;

    final int start = EdgeCounts.pOp(mState.mNumVertices);
    final Edge rp = ref.mPrev;
    final Edge rn = ref.mNext;

    firstEdge[ref.mStart] = rn; /* just in case ref was "firstEdge" */
    ref.mStart = ref.mInverse.mEnd = mState.mNumVertices;
    ref.mNext = edges[start + 4];
    ref.mPrev = edges[start + 2];
    degree[mState.mNumVertices] = degree[mState.mNumVertices + 1] = 4;
    firstEdge[mState.mNumVertices] = edges[start];
    firstEdge[mState.mNumVertices + 1] = edges[start + 1];


    int buffer = rn.mEnd;
    degree[buffer] += 2;
    int work = start + 4;
    Edge w = edges[work];
    w.mEnd = buffer;
    w.mPrev = ref;
    Edge work2 = rn.mInverse.mNext;
    /*work=start+5;*/
    w = edges[++work];
    w.mStart = buffer;
    w.mNext = work2;
    work2.mPrev = w;
    work2 = rn.mInverse;
    /*work=start+6;*/
    w = edges[++work];
    w.mStart = buffer;
    w.mPrev = work2;
    work2.mNext = w;
    /*(start+7)*/
    edges[++work].mEnd = buffer;

    buffer = rn.mStart;
    /*work=start+8;*/
    w = edges[++work];
    w.mStart = buffer;
    w.mPrev = rp;
    w.mNext = rn;
    rn.mPrev = rp.mNext = w;
    /*(start+9)*/
    edges[++work].mEnd = buffer;

    buffer = rp.mEnd;
    degree[buffer] += 2;
    work2 = rp.mInverse.mPrev;
    /*work=start+10;*/
    w = edges[++work];
    w.mStart = buffer;
    w.mNext = rp.mInverse;
    rp.mInverse.mPrev = w;
    /*(start+11)*/
    edges[++work].mEnd = buffer;
    work = start + 3;
    w = edges[work];
    w.mStart = buffer;
    w.mPrev = work2;
    work2.mNext = w;
    /*work=start+2;*/
    w = edges[--work];
    w.mEnd = buffer;
    w.mNext = ref;

    mState.mNumVertices += 2;
    mState.mNumEdges += 12;
    return ref;
  }

  /* This routine is the implementation of the inverse P-operation in Batagelj's
     paper. It removes the two new vertices -- mState.mNumVertices and mState.mNumVertices+1. The reference edge
     ref is c.e and when c and e are removed becomes x.e

          a
         / \
    x---b---c---e  The edge c-.e is the reference edge
         \ /
          d

  */
  @Override
  public void reduce(final Edge ref) {
    final int[] degree = mState.mDegree;
    final Edge[] firstEdge = mState.mFirstEdge;
    /* 4 edges forming the square whose inside is removed (except ref) */

    Edge a = ref.mInverse.mNext;
    Edge b = ref.mInverse.mPrev;
    Edge c = a.mInverse.mNext.mNext.mNext.mInverse;
    Edge d = b.mInverse.mPrev.mPrev.mPrev.mInverse;

    degree[a.mEnd] -= 2;
    degree[b.mEnd] -= 2;

    ref.mStart = ref.mInverse.mEnd = c.mStart;
    firstEdge[ref.mStart] = ref;
    ref.mNext = d;
    d.mPrev = ref;
    ref.mPrev = c;
    c.mNext = ref;

    a = a.mInverse;
    c = c.mInverse;
    a.mNext = c;
    c.mPrev = a;
    firstEdge[a.mStart] = a;

    b = b.mInverse;
    d = d.mInverse;
    b.mPrev = d;
    d.mNext = b;
    firstEdge[b.mStart] = b;

    mState.mNumVertices -= 2;
    mState.mNumEdges -= 12;
  }

  /* The P-operation with reference edge *ref has just been performed.
     Make a list in goodOr[0..*nGoodOr-1] of the reference edges of
     legal P-reductions (oriented editions) that might be canonical,
     with the first *nGoodRef of those being ref.
     Make a list in goodMir[0..*nGoodMir-1] of the
     reference edges of legal P-reductions (mirror-image editions) that
     might be canonical, with the first *nGoodMirRef of those being ref.
     *nGoodRef and *nGoodMirRef might each be 0 or 1.  If they are
     both 0, nothing else need be correct.
     All the edges in goodOr[] and goodMir[] must mStart with the same
     vertex degree and mEnd with the same vertex degree (actually, colour
     as passed to canonEdgeOriented).
     The "type" used in this procedure needs to match the requirements of
     findExtensions(), so changing it is dangerous.
     If hint!=null, it is an edge of the graph that has some chance of
     being a better P-reduction than the one just performed.
  */
  void legal(final Edge ref, final Edge[] goodOr, final MutableInteger nGoodOr, final MutableInteger nGoodRef,
                                final Edge[] goodMir, final MutableInteger nGoodMir, final MutableInteger nGoodMirRef, final Edge hint) {
    final int[] degree = mState.mDegree;
    Edge e, e1 = null;

    final long degEnd = degree[ref.mEnd];
    long deg0 = degEnd << 21;
    final long deg1 = mState.mNumVertices - degree[ref.mNext.mNext.mInverse.mNext.mNext.mEnd];
    long deg2 = degree[ref.mNext.mEnd];
    long deg3 = degree[ref.mPrev.mEnd];
    long deg4 = degree[ref.mInverse.mPrev.mPrev.mEnd];
    long deg5 = degree[ref.mInverse.mNext.mNext.mEnd];
    long bestType = deg0 + (deg1 << 11) + (deg2 << 2) + (deg3 << 1) + deg4 - deg5;
    long thisType = deg0 + (deg1 << 11) + (deg3 << 2) + (deg2 << 1) + deg5 - deg4;
    if (bestType > thisType) {
      goodOr[0] = ref;
      nGoodOr.set(1);
      nGoodRef.set(1);
      nGoodMir.set(0);
      nGoodMirRef.set(0);
    } else if (bestType == thisType) {
      goodOr[0] = goodMir[0] = ref;
      nGoodOr.set(1);
      nGoodRef.set(1);
      nGoodMir.set(1);
      nGoodMirRef.set(1);
    } else {
      goodMir[0] = ref;
      nGoodOr.set(0);
      nGoodRef.set(0);
      nGoodMir.set(1);
      nGoodMirRef.set(1);
      bestType = thisType;
    }

    if (hint != null) {
      e = hint;
      final int w = e.mEnd;
      e1 = e.mNext.mNext;
      if (degree[w] >= degEnd && degree[e.mStart] == 4 && degree[e.mNext.mEnd] != 4 && degree[e.mPrev.mEnd] != 4 && degree[e1.mEnd] == 4 && e != ref) {
        final int z = e1.mInverse.mNext.mNext.mEnd;
        boolean ok = degree[z] == 4;
        if (!ok) {
          Edge ew = e.mInverse;
          final Edge ewlast = ew.mPrev;
          for (ew = ew.mNext.mNext; ew != ewlast; ew = ew.mNext) {
            if (ew.mEnd == z) {
              break;
            }
          }
          ok = ew == ewlast;
        }

        if (ok) {
          deg0 = ((long) degree[w] << 21) + ((long) (mState.mNumVertices - degree[z]) << 11);
          deg2 = degree[e.mNext.mEnd];
          deg3 = degree[e.mPrev.mEnd];
          deg4 = degree[e.mInverse.mPrev.mPrev.mEnd];
          deg5 = degree[e.mInverse.mNext.mNext.mEnd];

          thisType = deg0 + (deg2 << 2) + (deg3 << 1) + deg4 - deg5;
          if (thisType > bestType) {
            nGoodRef.set(0);
            nGoodMirRef.set(0);
            return;
          }

          thisType = deg0 + (deg3 << 2) + (deg2 << 1) + deg5 - deg4;
          if (thisType > bestType) {
            nGoodRef.set(0);
            nGoodMirRef.set(0);
            return;
          }
        }
      }
    }

    for (int i = 0; i < mState.mNumVertices; ++i) {
      if (degree[i] == 4) {
        e = mState.mFirstEdge[i];
        int j = 0;
        if (degree[e.mEnd] == 4) {
          e1 = e;
          ++j;
        }
        e = e.mNext;
        if (degree[e.mEnd] == 4) {
          e1 = e;
          ++j;
        }
        e = e.mNext;
        if (degree[e.mEnd] == 4) {
          e1 = e;
          ++j;
        }
        e = e.mNext;
        if (degree[e.mEnd] == 4) {
          e1 = e;
          ++j;
        }
        if (j != 1) {
          continue;
        }

        e = e1.mNext.mNext;
        final int w = e.mEnd;
        if (degree[w] < degEnd || e == ref) {
          continue;
        }
        final int z = e1.mInverse.mNext.mNext.mEnd;

        if (degree[z] != 4) {
          Edge ew = e.mInverse;
          final Edge ewlast = ew.mPrev;
          for (ew = ew.mNext.mNext; ew != ewlast; ew = ew.mNext) {
            if (ew.mEnd == z) {
              break;
            }
          }
          if (ew != ewlast) {
            continue;
          }
        }

        deg0 = ((long) degree[w] << 21) + ((long) (mState.mNumVertices - degree[z]) << 11);
        deg2 = degree[e.mNext.mEnd];
        deg3 = degree[e.mPrev.mEnd];
        deg4 = degree[e.mInverse.mPrev.mPrev.mEnd];
        deg5 = degree[e.mInverse.mNext.mNext.mEnd];
        thisType = deg0 + (deg2 << 2) + (deg3 << 1) + deg4 - deg5;
        if (thisType > bestType) {
          nGoodRef.set(0);
          nGoodMirRef.set(0);
          return;
        } else if (thisType == bestType) {
          goodOr[nGoodOr.postIncrement()] = e;
        }
        thisType = deg0 + (deg3 << 2) + (deg2 << 1) + deg5 - deg4;
        if (thisType > bestType) {
          nGoodRef.set(0);
          nGoodMirRef.set(0);
          return;
        } else if (thisType == bestType) {
          goodMir[nGoodMir.postIncrement()] = e;
        }
      }
    }
  }
}
