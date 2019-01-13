package irvine.math.plantri;

/**
 * Checks whether the edge corresponds to a legal P3 reduction.
 * @author Gunnar Brinkmann
 * @author Brendan McKay
 * @author Sean A. Irvine
 */
public class P3LegalReduction implements LegalReduction {

  private final int[] mDegree;

  P3LegalReduction(final int[] degree) {
    mDegree = degree;
  }

  /* checks whether the edge corresponds to a legal P3 reduction.
       Returns 1 if it is a legal reduction, 0 else.

       Again it is assumed (necessary or not) that P1 has higher priority
       -- the nonexistence of a P1 reduction forces some sub-configuration.

       Furthermore it is assumed that the graph inspected is not the cube.
    */
  @Override
  public boolean legalReduction(Edge e) {
    if (mDegree[e.mNext.mEnd] != 3) {
      return false;
    }
    Edge run = e.mInverse.mPrev;
    if (mDegree[run.mEnd] != 3) {
      return false;
    }
    run = run.mPrev.mInverse.mPrev;
    if (mDegree[run.mEnd] != 3) {
      return false;
    }
    final int v1 = run.mStart;
    run = run.mPrev.mInverse.mPrev;
    if (mDegree[run.mEnd] != 3) {
      return false;
    }
    final int v2 = run.mStart;

    /* OK -- we have an "inserted square" on the right hand side */
    /* Test whether opposite vertices share a face */
    Edge last = e.mPrev;
    run = e.mNext.mNext.mNext;
    while (run != last) {
      if (run.mInverse.mPrev.mEnd == v1) {
        return false;
      }
      run = run.mNext;
    }

    e = e.mInverse;
    last = e.mPrev.mPrev.mPrev;
    run = e.mNext;
    while (run != last) {
      if (run.mInverse.mPrev.mEnd == v2) {
        return false;
      }
      run = run.mNext;
    }
    return true;
  }
}
