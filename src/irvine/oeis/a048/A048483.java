package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A048483 Array read by antidiagonals: T(k,n) = (k+1)2^n - k.
 * @author Sean A. Irvine
 */
public class A048483 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;

  private Z t(final int n, final int m) {
    return Z.valueOf(m + 1).shiftLeft(n).subtract(m);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mN - mM, mM);
  }
}
