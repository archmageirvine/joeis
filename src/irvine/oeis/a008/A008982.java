package irvine.oeis.a008;

/**
 * A008982.
 * @author Sean A. Irvine
 */
public class A008982 extends A008980 {

  @Override
  protected long[] select(final int n) {
    return mAllCurves.mS[n];
  }
}

