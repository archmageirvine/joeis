package irvine.oeis.a022;

/**
 * A022296 Least k&gt;1 such that complement of first n terms of Kolakoski sequence (A000002) repeats beginning at k-th term.
 * @author Sean A. Irvine
 */
public class A022296 extends A022294 {

  @Override
  protected boolean matches(final long k, final long len) {
    for (long j = k + len - 1, i = len - 1; i >= 0; --j, --i) {
      if (isSet(i) == isSet(j)) {
        return false;
      }
    }
    return true;
  }
}
