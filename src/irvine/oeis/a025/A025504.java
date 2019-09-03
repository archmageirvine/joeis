package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.a000.A000002;

/**
 * A025504 Least <code>k&gt;1</code> such that reverse complement of first n terms of Kolakoski sequence <code>(A000002)</code> repeats beginning at k-th term.
 * @author Sean A. Irvine
 */
public class A025504 extends A000002 {

  private long mN = -1;
  {
    super.next();
  }

  private boolean isReverseComplement(final long m, final long n) {
    for (long k = 0; k <= n; ++k) {
      if (isSet(n - k) == isSet(m + k)) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    ++mN;
    long m = 0;
    while (true) {
      if (++m + mN >= mLimit) {
        rewrite();
      }
      if (isReverseComplement(m, mN)) {
        return Z.valueOf(m + 1);
      }
    }
  }
}
