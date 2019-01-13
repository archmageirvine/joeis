package irvine.math.plantri;

/**
 * Checks whether the edge corresponds to a legal P3 reduction.
 * @author Gunnar Brinkmann
 * @author Brendan McKay
 * @author Sean A. Irvine
 */
public class P3MinLegalReduction implements LegalReduction {

  private final int[] mDegree;

  P3MinLegalReduction(final int[] degree) {
    mDegree = degree;
  }

  /* checks whether the edge corresponds to a legal P3 reduction.
       Returns 1 if it is a legal reduction, 0 else.
       mindeg 3 version

       Again it is assumed (necessary or not) that P1 has higher priority
       -- the nonexistence of a P1 reduction forces some subconfiguration.

       Furthermore it is assumed that the graph inspected is not the cube.
    */
  @Override
  public boolean legalReduction(final Edge e) {
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
    run = run.mPrev.mInverse.mPrev;
    return mDegree[run.mEnd] == 3;
  }
}
