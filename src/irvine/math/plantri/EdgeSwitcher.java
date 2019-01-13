package irvine.math.plantri;

/**
 * Routines for switching edges in a 4-gon.
 * @author Gunnar Brinkmann
 * @author Brendan McKay
 * @author Sean A. Irvine
 */
public class EdgeSwitcher {
  
  private final int[] mDegree;
  private final Edge[] mFirstEdge;

  EdgeSwitcher(final PlantriGraphState state) {
    mDegree = state.mDegree;
    mFirstEdge = state.mFirstEdge;
  }
  
  /* switches edge e -- that is: removes e and puts in the other diagonal in
       the 4-gon given by the two triangles adjacent to e */
  void switchEdge(Edge e) {
    // closing the gap when e is removed
    mFirstEdge[e.mStart] = e.mNext;
    e.mPrev.mNext = e.mNext;
    e.mNext.mPrev = e.mPrev;
    mDegree[e.mStart]--;

    // rotating e
    Edge work1 = e.mNext.mInverse;
    Edge work2 = work1.mNext;
    e.mStart = work1.mStart;
    e.mEnd = e.mPrev.mEnd;
    e.mPrev = work1;
    e.mNext = work2;
    work1.mNext = e;
    work2.mPrev = e;
    mDegree[work1.mStart]++;

    // Now doing the same with e.mInverse
    e = e.mInverse;
    mFirstEdge[e.mStart] = e.mNext;
    e.mPrev.mNext = e.mNext;
    e.mNext.mPrev = e.mPrev;
    mDegree[e.mStart]--;
    work1 = e.mNext.mInverse;
    work2 = work1.mNext;
    e.mStart = work1.mStart;
    e.mEnd = e.mPrev.mEnd;
    e.mPrev = work1;
    e.mNext = work2;
    work1.mNext = e;
    work2.mPrev = e;
    mDegree[work1.mStart]++;
  }

  /* Although switching twice is the identity on the graph, it is not on the
       data structure used. In the extend() routines the special order given
       in the initialisation is used */
  void switchEdgeBack(Edge e) {
    // closing the gap when e is removed
    mFirstEdge[e.mStart] = e.mNext;
    e.mPrev.mNext = e.mNext;
    e.mNext.mPrev = e.mPrev;
    mDegree[e.mStart]--;

    // rotating e
    Edge work2 = e.mPrev.mInverse;
    Edge work1 = work2.mPrev;
    e.mStart = work1.mStart;
    e.mEnd = e.mNext.mEnd;
    e.mPrev = work1;
    e.mNext = work2;
    work1.mNext = e;
    work2.mPrev = e;
    mDegree[work1.mStart]++;

    // Now doing the same with e.mInverse
    e = e.mInverse;
    mFirstEdge[e.mStart] = e.mNext;
    e.mPrev.mNext = e.mNext;
    e.mNext.mPrev = e.mPrev;
    mDegree[e.mStart]--;

    work2 = e.mPrev.mInverse;
    work1 = work2.mPrev;
    e.mStart = work1.mStart;
    e.mEnd = e.mNext.mEnd;
    e.mPrev = work1;
    e.mNext = work2;
    work1.mNext = e;
    work2.mPrev = e;
    mDegree[work1.mStart]++;
  }
}
