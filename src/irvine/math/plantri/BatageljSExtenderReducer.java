package irvine.math.plantri;

/**
 * Implementation of the S-operation in Batagelj's paper.
 * @author Gunnar Brinkmann
 * @author Brendan McKay
 * @author Sean A. Irvine
 */
class BatageljSExtenderReducer implements ExtenderReducer {

  private final PlantriGraphState mState;

  BatageljSExtenderReducer(final PlantriGraphState state) {
    mState = state;
  }

  /* This routine is the implementation of the S-operation in Batagelj's paper.
     It inserts 3 new vertices in triangular form into a triangle on the right
     hand side of ref */

  @Override
  public Edge extend(Edge ref) {
    final Edge[] edges = mState.mEdges;
    final Edge[] firstEdge = mState.mFirstEdge;
    final int[] degree = mState.mDegree;
    final int start = EdgeCounts.sOp(mState.mNumVertices);

    Edge a = ref.mInverse.mPrev;
    Edge b = a.mInverse.mPrev;

    degree[mState.mNumVertices] = degree[mState.mNumVertices + 1] = degree[mState.mNumVertices + 2] = 4;

    int dummy = ref.mStart;
    degree[dummy] += 2;
    edges[start + 10].mStart = edges[start + 11].mEnd = edges[start + 8].mStart = edges[start + 9].mEnd = dummy;

    dummy = ref.mEnd;
    degree[dummy] += 2;
    edges[start + 12].mStart = edges[start + 13].mEnd = edges[start + 14].mStart = edges[start + 15].mEnd = dummy;

    dummy = a.mEnd;
    degree[dummy] += 2;
    edges[start + 6].mStart = edges[start + 7].mEnd = edges[start + 16].mStart = edges[start + 17].mEnd = dummy;

    firstEdge[mState.mNumVertices] = edges[start + 1];
    firstEdge[mState.mNumVertices + 1] = edges[start];
    firstEdge[mState.mNumVertices + 2] = edges[start + 2];

    ref.mNext = edges[start + 10];
    edges[start + 10].mPrev = ref;
    a.mNext = edges[start + 14];
    edges[start + 14].mPrev = a;
    b.mNext = edges[start + 6];
    edges[start + 6].mPrev = b;

    ref = ref.mInverse;
    ref.mPrev = edges[start + 12];
    edges[start + 12].mNext = ref;
    a = a.mInverse;
    a.mPrev = edges[start + 16];
    edges[start + 16].mNext = a;
    b = b.mInverse;
    b.mPrev = edges[start + 8];
    edges[start + 8].mNext = b;

    mState.mNumVertices += 3;
    mState.mNumEdges += 18;
    return ref;
  }

  @Override
  public void reduce(final Edge ref) {
    final int[] degree = mState.mDegree;
    final Edge[] firstEdge = mState.mFirstEdge;
    final Edge a = ref.mInverse.mPrev.mPrev.mPrev;
    final Edge b = a.mInverse.mPrev.mPrev.mPrev;

    firstEdge[ref.mStart] = ref;
    degree[ref.mStart] -= 2;
    firstEdge[a.mStart] = a;
    degree[a.mStart] -= 2;
    firstEdge[b.mStart] = b;
    degree[b.mStart] -= 2;

    ref.mNext = b.mInverse;
    b.mInverse.mPrev = ref;
    a.mNext = ref.mInverse;
    ref.mInverse.mPrev = a;
    b.mNext = a.mInverse;
    a.mInverse.mPrev = b;

    mState.mNumVertices -= 3;
    mState.mNumEdges -= 18;
  }
}
