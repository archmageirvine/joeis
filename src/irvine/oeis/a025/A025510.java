package irvine.oeis.a025;

/**
 * A025510 Least <code>k&gt;1</code> such that complement of first n terms of <code>A006928</code> repeats beginning at k-th term.
 * @author Sean A. Irvine
 */
public class A025510 extends A025508 {

  @Override
  protected boolean isMatch(final long m, final long n) {
    for (long k = 0; k < n; ++k) {
      if (isSet(k) == isSet(m + k)) {
        return false;
      }
    }
    return true;
  }
}
