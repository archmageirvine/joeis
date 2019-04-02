package irvine.oeis.a008;

/**
 * A008981 Number of immersions of the unoriented circle into the oriented plane with n double points.
 * @author Sean A. Irvine
 */
public class A008981 extends A008980 {

  @Override
  protected long[] select(final int n) {
    return mAllCurves.mR2[n];
  }
}

