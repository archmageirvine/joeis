package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.a000.A000002;

/**
 * A022294 <code>a(n)</code> is the least <code>k&gt;1</code> such that first n terms of Kolakoski sequence <code>A000002</code> repeat beginning at k-th term.
 * @author Sean A. Irvine
 */
public class A022294 extends A000002 {

  private long mM = 0;
  private long mK = 1;

  private void ensure(final long n) {
    while (mN <= n) {
      super.next();
    }
  }

  protected boolean matches(final long k, final long len) {
    for (long j = k + len - 1, i = len - 1; i >= 0; --j, --i) {
      if (isSet(i) != isSet(j)) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    ++mM;
    while (true) {
      ensure(mK + mM);
      if (matches(mK, mM)) {
        return Z.valueOf(mK + 1);
      }
      ++mK;
    }
  }
}
