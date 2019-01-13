package irvine.math.plantri;

/**
 * Extends a graph in the way given by the type P2 extension for quadrangulations.
 * @author Gunnar Brinkmann
 * @author Brendan McKay
 * @author Sean A. Irvine
 */
class QuadrangulationP2ExtenderReducer implements ExtenderReducer {

  private final PlantriGraphState mState;

  QuadrangulationP2ExtenderReducer(final PlantriGraphState state) {
    mState = state;
  }

  /* extends a graph in the way given by the type P2 extension for
     3-connected quadrangulations.

     It returns the directed edge characterizing this operation.
  */

  @Override
  public Edge extend(Edge e) {
    final Edge[] edges = mState.mEdges;
    final Edge[] firstEdge = mState.mFirstEdge;
    final int[] degree = mState.mDegree;

    e = e.mNext;
    final int end2 = e.mEnd;
    final Edge e1 = e.mInverse;
    final Edge e4 = e1.mNext;
    final Edge e5 = e1.mPrev;
    final Edge e5i = e5.mInverse;
    final Edge e6i = e5i.mPrev;
    final int end3 = e5i.mStart;
    final Edge e3 = e4.mInverse.mNext.mInverse;
    final Edge e2 = e3.mNext;
    final int end1 = e3.mStart;

    final int start = EdgeCounts.quadrP2(mState.mNumVertices);
    final Edge se = edges[start];
    Edge dummy = edges[start + 1];
    se.mEnd = dummy.mStart = end3;
    degree[end3]++;
    e6i.mNext = e5i.mPrev = dummy;
    dummy.mPrev = e6i;
    dummy.mNext = e5i;

    dummy = edges[start + 3];
    dummy.mStart = edges[start + 2].mEnd = end2;
    firstEdge[end2] = dummy;
    e5.mNext = e4.mPrev = dummy;
    dummy.mNext = e4;
    dummy.mPrev = e5;

    dummy = edges[start + 5];
    dummy.mStart = edges[start + 4].mEnd = end1;
    degree[end1]++;
    e3.mNext = e2.mPrev = dummy;
    dummy.mNext = e2;
    dummy.mPrev = e3;

    dummy = edges[start + 7];
    e.mEnd = e1.mStart = mState.mNumVertices;
    se.mNext = dummy.mPrev = e1;
    e1.mNext = dummy;
    e1.mPrev = se;

    degree[mState.mNumVertices] = degree[mState.mNumVertices + 1] = 3;
    firstEdge[mState.mNumVertices] = se;
    firstEdge[mState.mNumVertices + 1] = edges[start + 2];

    mState.mNumVertices += 2;
    mState.mNumEdges += 8;

    return se;
  }

  @Override
  public void reduce(Edge e) {
    final int[] degree = mState.mDegree;
    final Edge[] firstEdge = mState.mFirstEdge;

    mState.mNumVertices -= 2;
    mState.mNumEdges -= 8;

    final Edge e1 = e.mNext;
    e = e.mInverse;
    final int end3 = e.mStart;
    final Edge e6i = e.mPrev;
    final Edge e5i = e.mNext;
    final Edge e5 = e5i.mInverse;
    final int end2 = e5.mStart;
    final Edge e4 = e5.mNext.mNext;
    final Edge e3 = e4.mInverse.mNext.mInverse;
    final int end1 = e3.mStart;
    final Edge e2 = e3.mNext.mNext;
    e = e1.mInverse;

    e6i.mNext = e5i;
    e5i.mPrev = e6i;
    degree[end3]--;
    firstEdge[end3] = e5i;

    e5.mNext = e4.mPrev = e1;
    e1.mNext = e4;
    e1.mPrev = e5;
    e1.mStart = e.mEnd = end2;
    firstEdge[end2] = e1;

    e3.mNext = e2;
    e2.mPrev = e3;
    degree[end1]--;
    firstEdge[end1] = e2;
  }
}
