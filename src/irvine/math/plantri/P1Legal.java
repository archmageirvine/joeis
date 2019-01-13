package irvine.math.plantri;

/**
 * Legality tests for the <code>P1</code> operation.
 * @author Gunnar Brinkmann
 * @author Brendan McKay
 * @author Sean A. Irvine
 */
public final class P1Legal {

  private P1Legal() { }

  /* checks whether the edge e characterizes a legal P1-reduction.
       Returns 1 if yes, 0 otherwise.

       It is assumed that edge.mStart has degree 3, and that both the side
       vertices edge.mNext.mEnd and edge.mPrev.mEnd have degree at least 4.
    */
  static boolean isLegalP1Reduction(Edge e) {
    final int w = e.mEnd;
    Edge run = e.mNext.mInverse.mPrev.mInverse;
    Edge last = run.mPrev;
    run = run.mNext;

    do {
      if (run.mEnd == w) {
        return false;
      }
      run = run.mNext;
    } while (run != last);

    e = e.mInverse;
    final int w1 = e.mNext.mEnd;
    final int w2 = e.mPrev.mEnd;

    // OK -- then some serious tests have to be done...
    run = last.mNext;
    last = last.mPrev;

    if (run.mInverse.mPrev.mEnd == w1) {
      return false;
    }

    // cannot be w2
    for (run = run.mNext; run != last; run = run.mNext) {
      final int buffer = run.mInverse.mPrev.mEnd;
      if (buffer == w1) {
        return false;
      }
      if (buffer == w2) {
        return false;
      }
    }

    // the last one cannot be w1
    return run.mInverse.mPrev.mEnd != w2;
  }

  /* checks whether the edge e characterizes a legal P1-reduction.
     General quadrangulations version.
     Returns true if legal, false otherwise.

     It is assumed that edge.mStart has degree 3, and that there are
     no vertices of degree 2.
  */
  static boolean isLegalP1ReductionAll(final Edge e) {
    final int w = e.mEnd;
    Edge run = e.mNext.mInverse.mPrev.mInverse;
    final Edge last = run.mPrev;
    run = run.mNext;
    do {
      if (run.mEnd == w) {
        return false;
      }
      run = run.mNext;
    } while (run != last);
    return true;
  }

  /* checks whether the edge e characterizes a legal P1-reduction.
   mindeg 3 version
   Returns true if yes, false otherwise.

   It is assumed that edge.mStart has degree 3, and that both the side
   vertices edge.mNext.mEnd and edge.mPrev.mEnd have degree at least 4.
  */
  static boolean isLegalP1ReductionMin3(final Edge e) {
    final int w = e.mEnd;
    Edge run = e.mNext.mInverse.mPrev.mInverse;
    final Edge last = run.mPrev;
    run = run.mNext;
    do {
      if (run.mEnd == w) {
        return false;
      }
      run = run.mNext;
    } while (run != last);
    return true;
  }

  /* checks whether the edge e characterizes a legal P1-reduction.
       Version for 3-connected quadrangulations without non-facial 4-cycles.
       Returns 1 if yes, 0 otherwise.

       It is assumed that edge.mStart has degree 3, and that both the side
       vertices edge.mNext.mEnd and edge.mPrev.mEnd have degree at least 4.
    */
  static boolean legalP1ReductionNf4(final int[] degree, final Marks vertexMarks, final Edge e) {
    if (degree[e.mEnd] == 3) {
      return true;
    }
    vertexMarks.resetMarksVertex();
    Edge e1 = e.mInverse;
    Edge e1last = e1.mPrev;
    e1 = e1.mNext.mNext;
    do {
      vertexMarks.markVertex(e1.mEnd);
      e1 = e1.mNext;
    } while (e1 != e1last);

    e1 = e.mNext.mInverse.mPrev.mInverse;
    e1last = e1.mPrev;
    e1 = e1.mNext;
    do {
      final Edge e2last = e1.mInverse;
      Edge e2 = e2last.mNext;
      do {
        if (vertexMarks.isMarkedVertex(e2.mEnd)) {
          return false;
        }
        e2 = e2.mNext;
      } while (e2 != e2last);

      e1 = e1.mNext;
    } while (e1 != e1last);
    return true;
  }
}
