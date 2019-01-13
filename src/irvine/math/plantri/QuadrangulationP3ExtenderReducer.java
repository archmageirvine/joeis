package irvine.math.plantri;

import irvine.math.MutableInteger;

/**
 * Extends a graph in the way given by the type P3 extension for quadrangulations.
 * @author Gunnar Brinkmann
 * @author Brendan McKay
 * @author Sean A. Irvine
 */
class QuadrangulationP3ExtenderReducer implements ExtenderReducer {

  private final PlantriGraphState mState;
  private final EdgeFactory mEdgeFactory;

  QuadrangulationP3ExtenderReducer(final PlantriGraphState state, final EdgeFactory edgeFactory) {
    mState = state;
    mEdgeFactory = edgeFactory;
  }

  /* extends a graph in the way given by the type P3 extension for
     3-connected quadrangulations. That is: It inserts a square on the
     right hand side of e.

     It returns the directed edge characterizing this operation.
  */
  @Override
  public Edge extend(Edge e) {
    final Edge[] edges = mState.mEdges;
    final Edge[] firstEdge = mState.mFirstEdge;
    final int[] degree = mState.mDegree;
    final int start = EdgeCounts.quadrP3(mState.mNumVertices);

    Edge run = e.mNext;
    int vertex = e.mStart;
    Edge dummy = edges[start + 12];
    edges[start].mEnd = dummy.mStart = vertex;
    degree[vertex]++;
    e.mNext = run.mPrev = dummy;
    dummy.mNext = run;
    dummy.mPrev = e;

    e = run.mInverse;
    run = e.mNext;
    vertex = e.mStart;
    dummy = edges[start + 15];
    edges[start + 10].mEnd = dummy.mStart = vertex;
    degree[vertex]++;
    e.mNext = run.mPrev = dummy;
    dummy.mNext = run;
    dummy.mPrev = e;

    e = run.mInverse;
    run = e.mNext;
    vertex = e.mStart;
    dummy = edges[start + 14];
    edges[start + 7].mEnd = dummy.mStart = vertex;
    degree[vertex]++;
    e.mNext = run.mPrev = dummy;
    dummy.mNext = run;
    dummy.mPrev = e;

    e = run.mInverse;
    run = e.mNext;
    vertex = e.mStart;
    dummy = edges[start + 13];
    edges[start + 4].mEnd = dummy.mStart = vertex;
    degree[vertex]++;
    e.mNext = run.mPrev = dummy;
    dummy.mNext = run;
    dummy.mPrev = e;

    firstEdge[mState.mNumVertices] = edges[start];
    degree[mState.mNumVertices] = 3;
    firstEdge[mState.mNumVertices + 1] = edges[start + 3];
    degree[mState.mNumVertices + 1] = 3;
    firstEdge[mState.mNumVertices + 2] = edges[start + 6];
    degree[mState.mNumVertices + 2] = 3;
    firstEdge[mState.mNumVertices + 3] = edges[start + 9];
    degree[mState.mNumVertices + 3] = 3;

    mState.mNumVertices += 4;
    mState.mNumEdges += 16;

    return run.mInverse;
  }

  @Override
  public void reduce(Edge e) {
    final int[] degree = mState.mDegree;
    final Edge[] firstEdge = mState.mFirstEdge;

    mState.mNumVertices -= 4;
    mState.mNumEdges -= 16;

    Edge dummy = e.mNext.mNext;
    int start = e.mStart;
    degree[start]--;
    firstEdge[start] = e;
    e.mNext = dummy;
    dummy.mPrev = e;

    e = dummy.mInverse;
    dummy = e.mNext.mNext;
    start = e.mStart;
    degree[start]--;
    firstEdge[start] = e;
    e.mNext = dummy;
    dummy.mPrev = e;

    e = dummy.mInverse;
    dummy = e.mNext.mNext;
    start = e.mStart;
    degree[start]--;
    firstEdge[start] = e;
    e.mNext = dummy;
    dummy.mPrev = e;

    e = dummy.mInverse;
    dummy = e.mNext.mNext;
    start = e.mStart;
    degree[start]--;
    firstEdge[start] = e;
    e.mNext = dummy;
    dummy.mPrev = e;
  }

  private int qorcol3(final Edge e) {
    return (mState.mDegree[e.mNext.mEnd] << 10) + mState.mDegree[e.mPrev.mEnd];
  }

  private int qmircol3(final Edge e) {
    return (mState.mDegree[e.mPrev.mEnd] << 10) + mState.mDegree[e.mNext.mEnd];
  }

  /* The P3-operation with reference edge *ref has just been performed.
   Make a list in goodOr[0..*nGoodOr-1] of the reference edges of
   legal P3-reductions (oriented editions) that might be canonical,
   with the first *nGoodRef of those being ref.
   Make a list in goodMir[0..*nGoodMir-1] of the
   reference edges of legal four-reductions (mirror-image editions)
   that might be canonical, with the first *nGoodMirRef of those being
   ref.mNext.
   *nGoodRef and *nGoodMirRef might each be 0-4.  If they are
   both 0, nothing else need be correct.
   All the edges in goodOr[] and goodMir[] must mStart with the same
   vertex degree and mEnd with the same vertex degree (actually, colour
   as passed to canonEdgeOriented).
   P3-reductions have a priority (colour) based on the degrees of the
   mEnd vertex and two side vertices.  It cannot be changed without
   changing findExtensions too.
  */
  void legal(final Edge ref, final Edge[] goodOr, final MutableInteger nGoodOr, final MutableInteger nGoodRef,
                                   final Edge[] goodMir, final MutableInteger nGoodMir, final MutableInteger nGoodMirRef, final LegalReduction lr) {
    int col;
    int col1;
    int col2;
    int maxcol = 0;
    int nor = 0;
    int nmir = 0;
    final Edge[] edges = mState.mEdges;
    final int[] degree = mState.mDegree;

    mEdgeFactory.resetMarks(edges);
    int maxdeg = 0;
    Edge e1 = ref.mNext;

    for (int j = 0; j < 4; ++j) {
      if (degree[e1.mStart] > maxdeg) {
        maxdeg = degree[e1.mStart];
        maxcol = qorcol3(e1);
        nor = nmir = 0;
        goodOr[nor++] = e1;

        col = qmircol3(e1);
        if (col > maxcol) {
          nor = nmir = 0;
          goodMir[nmir++] = e1;
          maxcol = col;
        } else if (col == maxcol) {
          goodMir[nmir++] = e1;
        }
      } else if (degree[e1.mStart] == maxdeg) {
        col = qorcol3(e1);
        if (col > maxcol) {
          nor = nmir = 0;
          goodOr[nor++] = e1;
          maxcol = col;
        } else if (col == maxcol) {
          goodOr[nor++] = e1;
        }

        col = qmircol3(e1);
        if (col > maxcol) {
          nor = nmir = 0;
          goodMir[nmir++] = e1;
          maxcol = col;
        } else if (col == maxcol) {
          goodMir[nmir++] = e1;
        }
      }

      mEdgeFactory.markLo(e1);
      e1 = e1.mPrev.mInverse.mPrev;
    }

    nGoodRef.set(nor);
    nGoodMirRef.set(nmir);

    for (int i = 0; i < mState.mNumVertices; ++i) {
      if (degree[i] > maxdeg) {
        final Edge elast = mState.mFirstEdge[i];
        Edge e = elast;
        do {
          if (!mEdgeFactory.isMarkedLo(e) && lr.legalReduction(e.mPrev)) {
            nGoodRef.set(0);
            nGoodMirRef.set(0);
            return;
          }
          e = e.mNext;
        } while (e != elast);
      } else if (degree[i] == maxdeg) {
        final Edge elast = mState.mFirstEdge[i];
        Edge e = elast;
        do {
          if (!mEdgeFactory.isMarkedLo(e)) {
            col1 = qorcol3(e);
            col2 = qmircol3(e);
            if (col1 > maxcol || col2 > maxcol) {
              if (lr.legalReduction(e.mPrev)) {
                nGoodRef.set(0);
                nGoodMirRef.set(0);
                return;
              }
            } else if ((col1 == maxcol || col2 == maxcol) && lr.legalReduction(e.mPrev)) {
              if (col1 == maxcol) {
                goodOr[nor++] = e;
              }
              if (col2 == maxcol) {
                goodMir[nmir++] = e;
              }
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
