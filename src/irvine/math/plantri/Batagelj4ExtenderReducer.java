package irvine.math.plantri;

/**
 * Another implementation of the 4-operation in Batagelj's paper.
 * @author Gunnar Brinkmann
 * @author Brendan McKay
 * @author Sean A. Irvine
 */
class Batagelj4ExtenderReducer implements ExtenderReducer {

  private final PlantriGraphState mState;

  Batagelj4ExtenderReducer(final PlantriGraphState state) {
    mState = state;
  }

  @Override
  public Edge extend(final Edge ref) {
    final Edge[] edges = mState.mEdges;
    final int[] degree = mState.mDegree;
    final Edge[] firstEdge = mState.mFirstEdge;

    int start = EdgeCounts.fourOp(mState.mNumVertices);
    Edge b = ref.mNext.mInverse;
    Edge a = b.mNext;

    degree[mState.mNumVertices] = 4;
    firstEdge[mState.mNumVertices] = edges[start];

    int dummy = start + 1;
    edges[start].mEnd = edges[dummy].mStart = a.mStart;
    degree[a.mStart]++;
    a.mPrev = b.mNext = edges[dummy];
    edges[dummy].mPrev = b;
    edges[dummy].mNext = a;

    b = b.mInverse;
    a = ref.mPrev;

    start += 2; /*2*/
    dummy = start + 1;
    edges[start].mEnd = edges[dummy].mStart = b.mStart;
    firstEdge[b.mStart] = edges[dummy];
    b.mPrev = a.mNext = edges[dummy];
    edges[dummy].mPrev = a;
    edges[dummy].mNext = b;

    a = a.mInverse;
    b = a.mPrev;
    start += 2; /*4*/
    dummy = start + 1;
    edges[start].mEnd = edges[dummy].mStart = b.mStart;
    degree[b.mStart]++;
    a.mPrev = b.mNext = edges[dummy];
    edges[dummy].mPrev = b;
    edges[dummy].mNext = a;

    edges[start].mNext = edges[start - 4].mPrev = ref;
    ref.mNext = edges[start - 4];
    ref.mPrev = edges[start];
    ref.mStart = ref.mInverse.mEnd = mState.mNumVertices;

    mState.mNumVertices++;
    mState.mNumEdges += 6;
    return ref;
  }

  @Override
  public void reduce(final Edge ref) {
    final Edge[] firstEdge = mState.mFirstEdge;
    final int[] degree = mState.mDegree;

    Edge a = ref.mInverse.mPrev.mInverse;
    Edge b = a.mPrev.mPrev;

    a.mPrev = b;
    b.mNext = a;
    firstEdge[a.mStart] = a;
    degree[a.mStart]--;

    a = b.mInverse;
    b = a.mPrev.mPrev;
    a.mPrev = b.mNext = ref;
    ref.mNext = a;
    ref.mPrev = b;
    ref.mStart = ref.mInverse.mEnd = a.mStart;
    firstEdge[a.mStart] = a;

    a = b.mInverse;
    b = a.mPrev.mPrev;
    a.mPrev = b;
    b.mNext = a;
    firstEdge[a.mStart] = a;
    degree[a.mStart]--;

    mState.mNumVertices--;
    mState.mNumEdges -= 6;
  }
}
