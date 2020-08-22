package irvine.oeis.a025;

/**
 * A025509 Least k&gt;1 such that reverse of first n terms of A006928 repeats beginning at k-th term.
 * @author Sean A. Irvine
 */
public class A025509 extends A025508 {

  @Override
  protected boolean isMatch(final long m, final long n) {
    for (long k = 0; k < n; ++k) {
      if (isSet(n - k - 1) != isSet(m + k)) {
        return false;
      }
    }
    return true;
  }
}
