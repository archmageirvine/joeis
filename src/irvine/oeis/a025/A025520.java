package irvine.oeis.a025;

/**
 * A025520 Least k&gt;1 such that reverse of first n terms of A022303 repeats beginning at k-th term.
 * @author Sean A. Irvine
 */
public class A025520 extends A025519 {

  @Override
  protected boolean isMatch(final long m, final long n) {
    for (long k = 0; k < n; ++k) {
      if (mA.isSet(n - k - 1) != mA.isSet(m + k)) {
        return false;
      }
    }
    return true;
  }
}
