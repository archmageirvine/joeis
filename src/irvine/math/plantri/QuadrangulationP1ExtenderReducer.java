package irvine.math.plantri;

import irvine.math.MutableInteger;

/**
 * Extends a graph in the way given by the type <code>P1</code> extension for quadrangulations.
 * @author Gunnar Brinkmann
 * @author Brendan McKay
 * @author Sean A. Irvine
 */
class QuadrangulationP1ExtenderReducer implements ExtenderReducer {

  private final EdgeFactory mEdgeFactory;
  private final PlantriGraphState mState;

  QuadrangulationP1ExtenderReducer(final PlantriGraphState state, final EdgeFactory edgeFactory) {
    mEdgeFactory = edgeFactory;
    mState = state;
  }

  /* extends a graph in the way given by the type P1 extension for
     3-connected quadrangulations.

     It returns the directed edge characterizing this operation.
  */
  @Override
  public Edge extend(final Edge e) {
    final Edge[] edges = mState.mEdges;
    final Edge[] firstEdge = mState.mFirstEdge;
    final int[] degree = mState.mDegree;

    final int center = e.mStart;
    final Edge e1 = e.mPrev;
    final Edge e1i = e1.mInverse;
    final Edge e2 = e1i.mPrev;
    final int end1 = e2.mStart;

    final Edge e3 = e.mNext;
    final Edge e3i = e3.mInverse;
    final Edge e4 = e3i.mNext;
    final int end2 = e4.mStart;

    e1.mNext = e3;
    e3.mPrev = e1;
    degree[center]--;
    firstEdge[center] = e1;

    int start = EdgeCounts.quadrP1(mState.mNumVertices);
    Edge se = edges[start];
    Edge dummy = edges[start + 1];
    se.mStart = dummy.mEnd = end1;
    degree[end1]++;
    se.mNext = e1i;
    e1i.mPrev = se;
    se.mPrev = e2;
    e2.mNext = se;

    dummy.mNext = e;
    e.mPrev = dummy;

    start += 2;
    se = edges[start];
    dummy = edges[start + 1];
    se.mStart = dummy.mEnd = end2;
    degree[end2]++;
    e3i.mNext = se;
    se.mPrev = e3i;
    e4.mPrev = se;
    se.mNext = e4;

    e.mNext = dummy;
    dummy.mPrev = e;

    degree[mState.mNumVertices] = 3;
    e.mStart = e.mInverse.mEnd = mState.mNumVertices;
    firstEdge[mState.mNumVertices] = e;
    mState.mNumVertices++;
    mState.mNumEdges += 4;

    return e;

  }

  @Override
  public void reduce(final Edge e) {
    final int[] degree = mState.mDegree;
    final Edge[] firstEdge = mState.mFirstEdge;
    mState.mNumVertices--;
    mState.mNumEdges -= 4;

    final Edge e2 = e.mPrev.mInverse.mPrev;
    final int end1 = e2.mStart;
    final Edge e1i = e2.mNext.mNext;
    final Edge e1 = e1i.mInverse;
    final int center = e1.mStart;
    final Edge e3 = e1.mNext;
    final Edge e3i = e3.mInverse;
    final Edge e4 = e3i.mNext.mNext;
    final int end2 = e4.mStart;

    e2.mNext = e1i;
    e1i.mPrev = e2;
    firstEdge[end1] = e2;
    degree[end1]--;
    e1.mNext = e;
    e.mPrev = e1;
    e.mNext = e3;
    e3.mPrev = e;
    e.mStart = e.mInverse.mEnd = center;
    degree[center]++;
    e3i.mNext = e4;
    e4.mPrev = e3i;
    firstEdge[end2] = e4;
    degree[end2]--;
  }

  private int qOrCol(final Edge e) {
    return (mState.mDegree[e.mPrev.mEnd] << 10) + mState.mDegree[e.mNext.mEnd];
  }

  private int qMirCol(final Edge e) {
    return (mState.mDegree[e.mNext.mEnd] << 10) + mState.mDegree[e.mPrev.mEnd];
  }

  /* The P1-operation with reference edge *ref has just been performed.
 prevP1[0..nprevP1-1] are all earlier P1s since the last P2 or P3.
 hint (unless it is null) is a suggestion for a P1-reduction that
 might be better than ref.
 Make a list in goodOr[0..*nGoodOr-1] of the reference edges of
 legal P1-reductions (oriented editions) that might be canonical,
 with the first *nGoodRef of those being ref.
 Make a list in goodMir[0..*nGoodMir-1] of the
 reference edges of legal four-reductions (mirror-image editions)
 that might be canonical, with the first *nGoodMirRef of those being
 ref.mNext.
 *nGoodRef and *nGoodMirRef might each be 0-1.  If they are
 both 0, nothing else need be correct.
 All the edges in goodOr[] and goodMir[] must mStart with the same
 vertex degree and mEnd with the same vertex degree (actually, colour
 as passed to canonEdgeOriented).
 P1-reductions have a priority (colour) based on the degrees of the
 mEnd vertex and two side vertices.  It cannot be changed without
 changing findExtensions too.
*/
  void legal(final Edge ref, final Edge[] goodOr, final MutableInteger nGoodOr, final MutableInteger nGoodRef,
             final Edge[] goodMir, final MutableInteger nGoodMir, final MutableInteger nGoodMirRef,
             final Edge[] prevP1, final int nprevP1, final Edge[] hint) {
    final int[] degree = mState.mDegree;
    final Edge[] edges = mState.mEdges;
    mEdgeFactory.resetMarks(edges);
    int nor = 0;
    int nmir = 0;

    final int maxdeg = degree[ref.mEnd];
    int maxcol = qOrCol(ref);
    int col = qMirCol(ref);
    if (col < maxcol) {
      goodOr[nor++] = ref;
    } else if (col == maxcol) {
      goodOr[nor++] = ref;
      goodMir[nmir++] = ref;
    } else {
      maxcol = col;
      goodMir[nmir++] = ref;
    }
    nGoodRef.set(nor);
    nGoodMirRef.set(nmir);
    mEdgeFactory.markLo(ref.mInverse);
    Edge e = hint[0];
    if (e != null && degree[e.mStart] == 3 && degree[e.mEnd] >= maxdeg && degree[e.mNext.mEnd] >= 4 && degree[e.mPrev.mEnd] >= 4 && !mEdgeFactory.isMarkedLo(e.mInverse) && P1Legal.isLegalP1Reduction(e)) {
      if (degree[e.mEnd] > maxdeg) {
        nGoodRef.set(0);
        nGoodMirRef.set(0);
        return;
      } else {
        col = qOrCol(e);
        if (col > maxcol) {
          nGoodRef.set(0);
          nGoodMirRef.set(0);
          return;
        } else if (col == maxcol) {
          goodOr[nor++] = e;
        }
        col = qMirCol(e);
        if (col > maxcol) {
          nGoodRef.set(0);
          nGoodMirRef.set(0);
          return;
        } else if (col == maxcol) {
          goodMir[nmir++] = e;
        }
      }
      mEdgeFactory.markLo(e.mInverse);
    }

    for (int i = nprevP1; --i >= 0; ) {
      e = prevP1[i];
      if (degree[e.mEnd] >= maxdeg && degree[e.mStart] == 3 && degree[e.mNext.mEnd] >= 4 && degree[e.mPrev.mEnd] >= 4 && !mEdgeFactory.isMarkedLo(e.mInverse) && P1Legal.isLegalP1Reduction(e)) {
        if (degree[e.mEnd] > maxdeg) {
          nGoodRef.set(0);
          nGoodMirRef.set(0);
          return;
        } else {
          col = qOrCol(e);
          if (col > maxcol) {
            nGoodRef.set(0);
            nGoodMirRef.set(0);
            return;
          } else if (col == maxcol) {
            goodOr[nor++] = e;
          }
          col = qMirCol(e);
          if (col > maxcol) {
            nGoodRef.set(0);
            nGoodMirRef.set(0);
            return;
          } else if (col == maxcol) {
            goodMir[nmir++] = e;
          }
        }
      }
      mEdgeFactory.markLo(e.mInverse);
    }

    if (nor > nGoodRef.get() || nmir > nGoodMirRef.get()) {
      final MutableInteger qnor = new MutableInteger(nor);
      final MutableInteger qnmir = new MutableInteger(nmir);
      Pruner.pruneOrientedLists(goodOr, qnor, nGoodRef, goodMir, qnmir, nGoodMirRef, degree);
      nor = qnor.get();
      nmir = qnmir.get();
    }

    if (nGoodRef.get() == 0 && nGoodMirRef.get() == 0) {
      return;
    }
    for (int i = 0; i < mState.mNumVertices; ++i) {
      if (degree[i] > maxdeg) {
        final Edge elast = mState.mFirstEdge[i];
        e = elast;
        do {
          if (degree[e.mEnd] == 3 && !mEdgeFactory.isMarkedLo(e)) {
            final Edge ee = e.mInverse;
            if (degree[ee.mNext.mEnd] >= 4
              && degree[ee.mPrev.mEnd] >= 4
              && P1Legal.isLegalP1Reduction(ee)) {
              nGoodRef.set(0);
              nGoodMirRef.set(0);
              hint[0] = e;
              return;
            }
          }
          e = e.mNext;
        } while (e != elast);
      } else if (degree[i] == maxdeg) {
        final Edge elast = mState.mFirstEdge[i];
        e = elast;
        do {
          final Edge ee = e.mInverse;
          if (degree[e.mEnd] == 3 && degree[ee.mNext.mEnd] >= 4 && degree[ee.mPrev.mEnd] >= 4 && !mEdgeFactory.isMarkedLo(e) && P1Legal.isLegalP1Reduction(ee)) {
            col = qOrCol(e.mInverse);
            if (col > maxcol) {
              nGoodRef.set(0);
              nGoodMirRef.set(0);
              hint[0] = e;
              return;
            } else if (col == maxcol) {
              goodOr[nor++] = e.mInverse;
            }
            col = qMirCol(e.mInverse);
            if (col > maxcol) {
              nGoodRef.set(0);
              nGoodMirRef.set(0);
              hint[0] = e;
              return;
            } else if (col == maxcol) {
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
