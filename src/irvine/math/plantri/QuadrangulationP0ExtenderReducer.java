package irvine.math.plantri;

/**
 * Extends a graph in the way given by the type <code>P0</code> extension for quadrangulations.
 * @author Gunnar Brinkmann
 * @author Brendan McKay
 * @author Sean A. Irvine
 */
class QuadrangulationP0ExtenderReducer implements ExtenderReducer {

  /* 
  
     The new path is inserted on the left of e1.
  
     It returns the directed edge starting at the new vertex with the
     new face on its left.
  
     In the picture: e1=b.a, the edge c.a is returned and
     vertex c is the new point mState.mNumVertices.
  
         ?
         a
        / \
      ?b   c?
        \ /
         d
         ?
  */

  private final PlantriGraphState mState;

  QuadrangulationP0ExtenderReducer(final PlantriGraphState state) {
    mState = state;
  }

  @Override
  public Edge extend(Edge e1) {
    final Edge[] edges = mState.mEdges;
    final Edge[] firstEdge = mState.mFirstEdge;
    final int[] degree = mState.mDegree;

    int start = EdgeCounts.quadrP0(mState.mNumVertices);
    Edge es = edges[start];

    degree[mState.mNumVertices] = 2;

    int buffer = e1.mEnd;
    Edge dummy = e1.mInverse;
    Edge dummy2 = dummy.mPrev;
    es.mStart = buffer;
    es.mNext = dummy;
    dummy.mPrev = es;
    es.mPrev = dummy2;
    dummy2.mNext = es;
    degree[buffer]++;

    es = edges[++start];
    firstEdge[mState.mNumVertices] = es;
    es.mEnd = buffer;

    e1 = e1.mNext;
    es = edges[++start];
    buffer = e1.mEnd;
    dummy = e1.mInverse;
    dummy2 = dummy.mNext;
    es.mStart = buffer;
    es.mNext = dummy2;
    dummy2.mPrev = es;
    es.mPrev = dummy;
    dummy.mNext = es;
    degree[buffer]++;

    edges[start + 1].mEnd = buffer;

    mState.mNumVertices++;
    mState.mNumEdges += 4;

    return edges[start - 1];
  }

  @Override
  public void reduce(final Edge e) {
    final int[] degree = mState.mDegree;
    final Edge[] firstEdge = mState.mFirstEdge;

    mState.mNumVertices--;
    mState.mNumEdges -= 4;

    Edge dummy = e.mInverse;
    Edge dummy2 = dummy.mNext;
    dummy = dummy.mPrev;

    dummy.mNext = dummy2;
    dummy2.mPrev = dummy;
    int buffer = dummy.mStart;
    firstEdge[buffer] = dummy;
    degree[buffer]--;

    dummy = e.mPrev.mInverse;
    dummy2 = dummy.mNext;
    dummy = dummy.mPrev;

    dummy.mNext = dummy2;
    dummy2.mPrev = dummy;
    buffer = dummy.mStart;
    firstEdge[buffer] = dummy;
    degree[buffer]--;
  }
}
