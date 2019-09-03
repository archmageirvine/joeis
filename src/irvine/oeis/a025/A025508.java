package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.a000.A000002;

/**
 * A025508 Least <code>k&gt;1</code> such that first n terms of <code>A006928</code> repeat beginning at k-th term.
 * @author Sean A. Irvine
 */
public class A025508 extends A000002 {

  // Some contortions so we can do this with A000002 rather than A006928

  private long mN = 0;
  {
    super.next();
  }

  @Override
  protected boolean isSet(final long n) {
    return n != 0 && super.isSet(n + 1);
  }

  protected boolean isMatch(final long m, final long n) {
    for (long k = 0; k < n; ++k) {
      if (isSet(k) != isSet(m + k)) {
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
      if (isMatch(m, mN)) {
        return Z.valueOf(m + 1);
      }
    }
  }
}
