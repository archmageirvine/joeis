package irvine.oeis.a078;

/**
 * A078629.
 * @author Sean A. Irvine
 */
public class A078676 extends A078629 {

  @Override
  protected boolean accept(final int n, final int ntrue) {
    for (int k = 0; k < n; ++k) {
      if (mPerm[k] != ntrue + 1 - mPerm[ntrue - 1 - k]) {
        return false;
      }
    }
    return true;
  }
}

