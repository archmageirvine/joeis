package irvine.math.plantri;

import irvine.math.MutableInteger;

/**
 * Extends a graph in the way given by the type b extension for 5-connected triangulations.
 * @author Gunnar Brinkmann
 * @author Brendan McKay
 * @author Sean A. Irvine
 */
public class Min5BExtenderReducer implements ExtenderReducer {

  private final PlantriGraphState mState;
  private final Marks mVertexMarks;
  private final EdgeFactory mEdgeFactory;

  Min5BExtenderReducer(final PlantriGraphState state, final Marks vertexMarks, final EdgeFactory edgeFactory) {
    mState = state;
    mVertexMarks = vertexMarks;
    mEdgeFactory = edgeFactory;
  }

  /* Check if the B-reduction (ref,mirror) is valid.  The important
     things are that two vertices have degree >= 6 and there are no
     non-facial 5-cycles that will become non-facial 4-cycles.
     It is assumed that the ends and sides of ref have degree 5.
  */
  boolean isValidMin5B(final Edge ref, final boolean mirror) {
    final int[] degree = mState.mDegree;
    final Edge refi = ref.mInverse;

    if (!mirror) {
      if (degree[ref.mNext.mNext.mEnd] < 6 || degree[refi.mNext.mNext.mEnd] < 6) {
        return false;
      }
      Edge e1 = ref.mPrev.mPrev.mInverse.mPrev.mPrev;
      Edge e2 = refi.mPrev.mPrev.mInverse.mPrev.mPrev;

      mVertexMarks.resetMarksVertex();

      for (Edge e = e1.mNext.mNext.mNext.mNext; e != e1; e = e.mNext) {
        mVertexMarks.markVertex(e.mEnd);
      }
      e1 = e1.mInverse;
      for (Edge e = e1.mPrev.mPrev.mPrev; e != e1; e = e.mPrev) {
        mVertexMarks.markVertex(e.mEnd);
      }
      for (Edge e = e2.mNext.mNext.mNext.mNext; e != e2; e = e.mNext) {
        if (mVertexMarks.isMarkedVertex(e.mEnd)) {
          return false;
        }
      }
      e2 = e2.mInverse;
      for (Edge e = e2.mPrev.mPrev.mPrev; e != e2; e = e.mPrev) {
        if (mVertexMarks.isMarkedVertex(e.mEnd)) {
          return false;
        }
      }
    } else {
      if (degree[ref.mPrev.mPrev.mEnd] < 6 || degree[refi.mPrev.mPrev.mEnd] < 6) {
        return false;
      }
      Edge e1 = ref.mNext.mNext.mInverse.mNext.mNext;
      Edge e2 = refi.mNext.mNext.mInverse.mNext.mNext;

      mVertexMarks.resetMarksVertex();

      for (Edge e = e1.mPrev.mPrev.mPrev.mPrev; e != e1; e = e.mPrev) {
        mVertexMarks.markVertex(e.mEnd);
      }
      e1 = e1.mInverse;
      for (Edge e = e1.mNext.mNext.mNext; e != e1; e = e.mNext) {
        mVertexMarks.markVertex(e.mEnd);
      }
      for (Edge e = e2.mPrev.mPrev.mPrev.mPrev; e != e2; e = e.mPrev) {
        if (mVertexMarks.isMarkedVertex(e.mEnd)) {
          return false;
        }
      }
      e2 = e2.mInverse;
      for (Edge e = e2.mNext.mNext.mNext; e != e2; e = e.mNext) {
        if (mVertexMarks.isMarkedVertex(e.mEnd)) {
          return false;
        }
      }
    }

    return true;
  }


  /* extends a graph in the way given by the type b extension for
   5-connected triangulations. The edge e must mStart and mEnd at
   a vertex of degree 5.

   It returns the edge characterizing this operation.
  */
  @Override
  public Edge extend(final Edge e) {
    final Edge[] edges = mState.mEdges;
    final Edge[] firstEdge = mState.mFirstEdge;
    final int[] degree = mState.mDegree;

    final Edge ei = e.mInverse;
    final Edge work2 = e.mNext;
    final Edge work3 = work2.mNext;
    final Edge e3i = work3.mNext;
    final Edge e3 = e3i.mInverse;
    final Edge e5i = e3.mNext;
    final Edge work1 = ei.mPrev;
    final Edge e2 = work1.mPrev;
    final Edge e2i = e2.mInverse;
    final Edge e4 = e2i.mPrev;

    final int center1 = e.mEnd;
    final int center2 = e.mStart;
    final int start3 = e3.mStart;
    final int end2 = e2.mEnd;

    final int start = EdgeCounts.min5B0(mState.mNumVertices);

    work1.mStart = work1.mInverse.mEnd = mState.mNumVertices;
    firstEdge[mState.mNumVertices] = work1;
    degree[mState.mNumVertices] = 5;

    work2.mStart = work2.mInverse.mEnd = work3.mStart = work3.mInverse.mEnd = mState.mNumVertices + 1;
    firstEdge[mState.mNumVertices + 1] = work2;
    degree[mState.mNumVertices + 1] = 5;

    firstEdge[center1] = ei;
    firstEdge[center2] = e;

    // The degree at center1 and center2 remains unchanged
    edges[start].mStart = end2;
    edges[start].mPrev = e4;
    e4.mNext = edges[start];
    edges[start].mNext = e2i;
    e2i.mPrev = edges[start];
    ++degree[end2];

    int run = start + 1;
    edges[run].mEnd = end2;
    edges[run].mNext = work1;
    work1.mPrev = edges[run];

    ++run; /*2*/
    edges[run].mStart = edges[run + 1].mEnd = center1;
    edges[run].mPrev = e2;
    e2.mNext = edges[run];
    edges[run].mNext = ei;
    ei.mPrev = edges[run];

    run += 2; /*4*/
    edges[run].mStart = edges[run + 1].mEnd = center2;
    edges[run].mPrev = e;
    e.mNext = edges[run];

    run += 2; /*6*/
    edges[run].mNext = work2;
    work2.mPrev = edges[run];

    ++run; /*7*/
    edges[run].mPrev = work1;
    work1.mNext = edges[run];

    ++run; /*8*/
    edges[run].mStart = edges[run + 1].mEnd = center2;
    edges[run].mNext = e3i;
    e3i.mPrev = edges[run];

    run += 2; /*10*/
    edges[run].mStart = start3;
    edges[run].mNext = e5i;
    e5i.mPrev = edges[run];
    edges[run].mPrev = e3;
    e3.mNext = edges[run];

    ++run; /*11*/
    edges[run].mEnd = start3;
    edges[run].mPrev = work3;
    work3.mNext = edges[run];
    degree[start3]++;

    mState.mNumVertices += 2;
    mState.mNumEdges += 12;

    return edges[start + 4]; /* is the smaller one */
  }

  @Override
  public void reduce(final Edge ref) {
    final int[] degree = mState.mDegree;
    final Edge[] firstEdge = mState.mFirstEdge;

    final Edge e = ref.mPrev;
    final Edge ei = e.mInverse;
    final Edge e2 = ei.mPrev.mPrev;
    final Edge e2i = e2.mInverse;
    final Edge e4 = e2i.mPrev.mPrev;
    final Edge work1 = e4.mNext.mInverse.mNext;
    final Edge e3i = e.mPrev.mPrev;
    final Edge e3 = e3i.mInverse;
    final Edge e5i = e3.mNext.mNext;
    final Edge work3 = e5i.mPrev.mInverse.mPrev;
    final Edge work2 = work3.mPrev;

    final int end2 = e2.mEnd;
    final int center1 = e.mEnd;
    final int center2 = e.mStart;
    final int start3 = e3.mStart;

    degree[end2]--;
    degree[start3]--;

    firstEdge[end2] = e4;
    firstEdge[center1] = ei;
    firstEdge[center2] = e;
    firstEdge[start3] = e3;

    e4.mNext = e2i;
    e2i.mPrev = e4;
    e2.mNext = work1;
    work1.mPrev = e2;
    ei.mPrev = work1;
    work1.mNext = ei;
    e.mNext = work2;
    work2.mPrev = e;
    e3i.mPrev = work3;
    work3.mNext = e3i;
    e3.mNext = e5i;
    e5i.mPrev = e3;

    work1.mStart = work1.mInverse.mEnd = center1;
    work2.mStart = work2.mInverse.mEnd = work3.mStart = work3.mInverse.mEnd = center2;

    mState.mNumVertices -= 2;
    mState.mNumEdges -= 12;
  }


  /* The B-operation with reference edge *ref and side mirror has just been
     performed.
     Make a list in goodOr[0..*nGoodOr-1] of the reference edges of
     legal B-reductions (oriented editions) that might be canonical,
     with the first *nGoodRef of those being ref.
     Make a list in goodMir[0..*nGoodMir-1] of the
     reference edges of legal four-reductions (mirror-image editions)
     that might be canonical, with the first *nGoodMirRef of those being
     ref.mNext.
     *nGoodRef and *nGoodMirRef might each be 0-2.  If they are
     both 0, nothing else need be correct.
     All the edges in goodOr[] and goodMir[] must mStart with the same
     vertex degree and mEnd with the same vertex degree (actually, colour
     as passed to canonEdgeOriented).
     This procedure does NOT determine that there are no A-reductions.
  */
  void legal(Edge ref, final boolean mirror, final Edge[] goodOr, final MutableInteger nGoodOr,
                  final MutableInteger nGoodRef, final Edge[] goodMir, final MutableInteger nGoodMir, final MutableInteger nGoodMirRef) {
    final Edge[] edges = mState.mEdges;
    final int[] degree = mState.mDegree;
    final Edge[] firstEdge = mState.mFirstEdge;
    Edge e, elast;
    int nor, nmir, i;

    ref = ref.mMin;
    nor = nmir = 0;

    if (!mirror) {
      goodOr[nor++] = ref;
      goodOr[nor++] = ref.mInverse;
    } else {
      goodMir[nmir++] = ref;
      goodMir[nmir++] = ref.mInverse;
    }

    nGoodRef.set(nor);
    nGoodMirRef.set(nmir);

    mEdgeFactory.resetMarks(edges);
    mEdgeFactory.markLo(ref);

    for (i = 0; i < mState.mNumVertices; ++i) {
      if (degree[i] == 5) {
        e = elast = firstEdge[i];
        do {
          if (e == e.mMin && degree[e.mPrev.mEnd] == 5 && degree[e.mEnd] == 5 && degree[e.mNext.mEnd] == 5 && !mEdgeFactory.isMarkedLo(e)) {
            if (isValidMin5B(e, false)) {
              goodOr[nor++] = e;
              goodOr[nor++] = e.mInverse;
            }
            if (isValidMin5B(e, true)) {
              goodMir[nmir++] = e;
              goodMir[nmir++] = e.mInverse;
            }
          }
          e = e.mNext;
        } while (e != elast);
      }
    }

    nGoodOr.set(nor);
    nGoodMir.set(nmir);
    if (nor > nGoodRef.get() || nmir > nGoodMirRef.get()) {
      Pruner.pruneOrientedLists(goodOr, nGoodOr, nGoodRef, goodMir, nGoodMir, nGoodMirRef, degree);
    }
  }
}
