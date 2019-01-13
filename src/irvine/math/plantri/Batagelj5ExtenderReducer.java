package irvine.math.plantri;

/**
 * Implementation of the 5-operation in Batagelj's paper.
 * @author Gunnar Brinkmann
 * @author Brendan McKay
 * @author Sean A. Irvine
 */
class Batagelj5ExtenderReducer implements ExtenderReducer {

  private final PlantriGraphState mState;

  Batagelj5ExtenderReducer(final PlantriGraphState state) {
    mState = state;
  }

  @Override
  public Edge extend(final Edge ref) {
    final Edge[] edges = mState.mEdges;
    final Edge[] firstEdge = mState.mFirstEdge;
    final int[] degree = mState.mDegree;

    int start = EdgeCounts.fiveOp(mState.mNumVertices);
    degree[mState.mNumVertices] = 5;
    firstEdge[mState.mNumVertices] = edges[start];


    Edge b = ref.mPrev;
    Edge a = ref.mNext;
    int dummy = start + 1;
    Edge d = edges[dummy];
    b.mNext = a.mPrev = d;
    d.mNext = a;
    d.mPrev = b;
    d.mStart = edges[start].mEnd = a.mStart;
    firstEdge[a.mStart] = a;

    a = b.mInverse;
    b = a.mPrev;
    start += 2; /*2*/
    dummy = start + 1;
    d = edges[dummy];
    b.mNext = a.mPrev = d;
    d.mNext = a;
    d.mPrev = b;
    d.mStart = edges[start].mEnd = a.mStart;
    degree[a.mStart]++;

    a = b.mInverse;
    b = a.mPrev.mPrev.mPrev;
    d = ref.mInverse;
    b.mNext = d;
    d.mPrev = b;
    firstEdge[a.mStart] = a;
    degree[a.mStart]--;

    a = b.mInverse;
    b = a.mPrev;
    start += 2; /*4*/
    dummy = start + 1;
    d = edges[dummy];
    b.mNext = a.mPrev = d;
    d.mNext = a;
    d.mPrev = b;
    d.mStart = edges[start].mEnd = a.mStart;
    degree[a.mStart]++;

    d = b.mInverse.mPrev.mInverse; /* the other remaining edge of the "v" */

    d.mStart = d.mInverse.mEnd = mState.mNumVertices;
    d.mNext = edges[start - 4];
    d.mPrev = edges[start];
    edges[start].mNext = d;
    edges[start - 4].mPrev = d;

    ref.mStart = ref.mInverse.mEnd = mState.mNumVertices;
    ref.mNext = edges[start];
    ref.mPrev = edges[start - 2];
    edges[start].mPrev = ref;
    edges[start - 2].mNext = ref;

    mState.mNumVertices++;
    mState.mNumEdges += 6;
    return ref;
  }

  @Override
  public void reduce(final Edge ref) {
    final int[] degree = mState.mDegree;
    final Edge[] firstEdge = mState.mFirstEdge;

    Edge a = ref.mNext.mNext;
    final Edge dummy = ref.mInverse;
    Edge b = dummy.mPrev;
    dummy.mPrev = b.mNext = a;
    a.mNext = dummy;
    a.mPrev = b;
    a.mStart = a.mInverse.mEnd = dummy.mStart;
    degree[dummy.mStart]++;

    a = b.mInverse;
    b = a.mPrev.mPrev;
    a.mPrev = b;
    b.mNext = a;
    degree[a.mStart]--;
    firstEdge[a.mStart] = a;

    a = b.mInverse.mPrev.mPrev.mInverse;
    b = a.mPrev.mPrev;
    a.mPrev = ref;
    ref.mNext = a;
    b.mNext = ref;
    ref.mPrev = b;
    ref.mStart = ref.mInverse.mEnd = a.mStart;
    firstEdge[a.mStart] = a;

    a = b.mInverse;
    b = a.mPrev.mPrev;
    a.mPrev = b;
    b.mNext = a;
    degree[a.mStart]--;
    firstEdge[a.mStart] = a;

    mState.mNumVertices--;
    mState.mNumEdges -= 6;
  }
}
