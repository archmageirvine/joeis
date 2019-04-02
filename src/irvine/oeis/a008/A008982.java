package irvine.oeis.a008;

/**
 * A008982 Number of immersions of the oriented circle into the unoriented plane with n double points.
 * @author Sean A. Irvine
 */
public class A008982 extends A008980 {

  @Override
  protected long[] select(final int n) {
    return mAllCurves.mS[n];
  }
}

