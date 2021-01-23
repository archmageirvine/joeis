package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.a022.A022303;

/**
 * A025519 Least k&gt;1 such that first n terms of A022303 repeat beginning at k-th term.
 * @author Sean A. Irvine
 */
public class A025519 extends A022303 {

  private long mN = 0;
  {
    super.next();
  }

  protected boolean isMatch(final long m, final long n) {
    for (long k = 0; k < n; ++k) {
      if (mA.isSet(k) != mA.isSet(m + k)) {
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
      ensure(++m + mN);
      if (isMatch(m, mN)) {
        return Z.valueOf(m + 1);
      }
    }
  }
}
