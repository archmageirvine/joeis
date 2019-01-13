package irvine.math.plantri;

import irvine.math.MutableInteger;

/**
 * Implementation of the Q-operation in Batagelj's paper.
 * @author Gunnar Brinkmann
 * @author Brendan McKay
 * @author Sean A. Irvine
 */
public class BipartiteQExtenderReducer implements ExtenderReducer {

  private final PlantriGraphState mState;

  /* This routine is the implementation of the Q-operation in Batagelj's
     paper.  It inserts one new vertex -- mState.mNumVertices. The reference edge ref is
     the one starting at the vertex to be split that will (always) become a
     valency 4 vertex in the new graph.

          a
     |\  /   reference edge mState.mNumVertices.a
     | \/mState.mNumVertices
     | /\
     |/  \

  The operations can only be understood by drawing a picture containing the edge
  numbers as initialized in init_P_op().
  */
  BipartiteQExtenderReducer(final PlantriGraphState state) {
    mState = state;
  }

  @Override
  public Edge extend(final Edge ref) {
    final Edge[] edges = mState.mEdges;
    final Edge[] firstEdge = mState.mFirstEdge;
    final int[] degree = mState.mDegree;
    int start = EdgeCounts.qOp(mState.mNumVertices);

    firstEdge[mState.mNumVertices] = ref;
    final Edge x = ref.mNext;
    Edge b = ref.mPrev.mInverse;
    final Edge a = b.mPrev;

    Edge d = x.mNext.mInverse;
    final Edge c = d.mNext;

    ref.mStart = ref.mInverse.mEnd = x.mStart = x.mInverse.mEnd = mState.mNumVertices;

    ref.mPrev = edges[start + 4];

    c.mPrev = edges[start + 1];
    d.mNext = edges[start + 2];
    b.mPrev = edges[start + 3];
    a.mNext = edges[start + 5];

    final int dummy = c.mStart;
    final int dummy2 = a.mStart;
    degree[dummy] += 2;
    degree[dummy2] += 2;
    degree[mState.mNumVertices] = 4;
    degree[b.mEnd] -= 2;
    edges[start].mPrev = x;
    x.mNext = edges[start];
    edges[start].mEnd = dummy;
    ++start;
    /*1*/
    edges[start].mNext = c;
    c.mPrev = edges[start];
    edges[start].mStart = dummy;
    ++start;
    /*2*/
    edges[start].mPrev = d;
    d.mNext = edges[start];
    edges[start].mStart = dummy;
    edges[start].mEnd = dummy2;
    ++start;
    /*3*/
    edges[start].mNext = b;
    b.mPrev = edges[start];
    edges[start].mStart = dummy2;
    edges[start].mEnd = dummy;
    ++start;
    /*4*/
    edges[start].mNext = ref;
    ref.mPrev = edges[start];
    edges[start].mEnd = dummy2;
    ++start;
    /*5*/
    edges[start].mPrev = a;
    a.mNext = edges[start];
    edges[start].mStart = dummy2;

    b = b.mInverse;
    d = d.mInverse;

    firstEdge[b.mStart] = b;
    b.mNext = d;
    d.mPrev = b;

    mState.mNumVertices++;
    mState.mNumEdges += 6;
    return ref;
  }

  @Override
  public void reduce(final Edge ref) {
    final Edge[] firstEdge = mState.mFirstEdge;
    final int[] degree = mState.mDegree;

    final Edge x = ref.mNext;
    final Edge a = ref.mInverse.mNext.mInverse;
    Edge b = a.mNext.mNext.mNext;

    final Edge c = x.mInverse.mPrev.mInverse;
    Edge d = c.mPrev.mPrev.mPrev;

    firstEdge[a.mStart] = a;
    firstEdge[c.mStart] = c;

    ref.mStart = ref.mInverse.mEnd = x.mStart = x.mInverse.mEnd = b.mEnd;
    degree[b.mEnd] += 2;
    degree[a.mStart] -= 2;
    degree[c.mStart] -= 2;

    b.mPrev = a;
    a.mNext = b;
    c.mPrev = d;
    d.mNext = c;

    b = b.mInverse;
    d = d.mInverse;

    b.mNext = ref;
    ref.mPrev = b;
    d.mPrev = x;
    x.mNext = d;

    mState.mNumVertices--;
    mState.mNumEdges -= 6;
  }

  /* The Q-operation with reference edge *ref has just been performed.
   Make a list in goodOr[0..*nGoodOr-1] of the reference edges of
   legal Q-reductions (oriented editions) that might be canonical,
   with the first *nGoodRef of those being ref.
   Make a list in goodMir[0..*nGoodMir-1] of the
   reference edges of legal P-reductions (mirror-image editions) that
   might be canonical, with the first *nGoodMirRef of those being
   ref.mNext.
   *nGoodRef and *nGoodMirRef might each be 0 or 1.  If they are
   both 0, nothing else need be correct.
   All the edges in goodOr[] and goodMir[] must mStart with the same
   vertex degree and mEnd with the same vertex degree (actually, colour
   as passed to canonEdgeOriented).
*/
  void legal(final Edge ref, final Edge[] goodOr, final MutableInteger nGoodOr, final MutableInteger nGoodRef,
                                final Edge[] goodMir, final MutableInteger nGoodMir, final MutableInteger nGoodMirRef) {
    final int[] degree = mState.mDegree;
    final Edge[] firstEdge = mState.mFirstEdge;
    long besttype = ((long) degree[ref.mEnd] << 10) + degree[ref.mNext.mEnd] + degree[ref.mPrev.mEnd];
    goodOr[0] = ref;
    nGoodOr.set(1);
    nGoodRef.set(1);

    Edge e = ref.mNext;
    long thistype = ((long) degree[e.mEnd] << 10) + degree[e.mNext.mEnd] + degree[e.mPrev.mEnd];
    if (thistype >= besttype) {
      goodMir[0] = e;
      nGoodMir.set(1);
      nGoodMirRef.set(1);
    } else {
      nGoodMir.set(0);
      nGoodMirRef.set(0);
    }
    if (thistype > besttype) {
      nGoodOr.set(0);
      nGoodRef.set(0);
      besttype = thistype;
    }

    for (int i = 0; i < mState.mNumVertices; ++i) {
      if (degree[i] == 4) {
        e = firstEdge[i];
        Edge e1 = e.mNext.mNext;
        for (int j = 0; j < 4; ++j, e = e.mNext, e1 = e1.mNext) {
          if (degree[e.mPrev.mEnd] < 6 || degree[e1.mEnd] < 6) {
            continue;
          }
          if (e == ref) {
            continue;
          }
          final int w = e1.mInverse.mPrev.mPrev.mEnd;

          final int z1 = e.mEnd;
          final int z2 = e.mNext.mEnd;
          final Edge ewlast = firstEdge[w];
          Edge ew = ewlast;
          do {
            if (ew.mEnd == z1 || ew.mEnd == z2) {
              break;
            }
            ew = ew.mNext;
          } while (ew != ewlast);
          if (ew.mEnd == z1 || ew.mEnd == z2) {
            continue;
          }

          thistype = ((long) degree[z1] << 10) + degree[z2] + degree[e.mPrev.mEnd];
          if (thistype > besttype) {
            nGoodRef.set(0);
            nGoodMirRef.set(0);
            return;
          } else if (thistype == besttype) {
            goodOr[nGoodOr.postIncrement()] = e;
          }

          thistype = ((long) degree[z2] << 10) + degree[z1] + degree[e1.mEnd];
          if (thistype > besttype) {
            nGoodRef.set(0);
            nGoodMirRef.set(0);
            return;
          } else if (thistype == besttype) {
            goodMir[nGoodMir.postIncrement()] = e.mNext;
          }
        }
      }
    }
  }

}
