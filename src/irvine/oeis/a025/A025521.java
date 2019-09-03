package irvine.oeis.a025;

/**
 * A025521 Least <code>k&gt;1</code> such that complement of first n terms of <code>A022303</code> repeats beginning at k-th term.
 * @author Sean A. Irvine
 */
public class A025521 extends A025519 {

  @Override
  protected boolean isMatch(final long m, final long n) {
    for (long k = 0; k < n; ++k) {
      if (mA.isSet(k) == mA.isSet(m + k)) {
        return false;
      }
    }
    return true;
  }
}
