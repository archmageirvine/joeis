package irvine.oeis.a008;

/**
 * A008983 Number of immersions of the unoriented circle into the unoriented plane with n double points.
 * @author Sean A. Irvine
 */
public class A008983 extends A008980 {

  @Override
  protected long[] select(final int n) {
    return mAllCurves.mNoOrient[n];
  }
}

