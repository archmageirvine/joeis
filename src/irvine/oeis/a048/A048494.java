package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A048494 Array T(k,n) read by antidiagonals: T(n,k) = 2^(n-1) * ((k+1)*n - 2k) + k + 1.
 * @author Sean A. Irvine
 */
public class A048494 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;

  private Z t(final int n, final int m) {
    return Z.valueOf((m + 1) * (long) n - 2L * m).shiftLeft(n - 1).add(m + 1);
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
