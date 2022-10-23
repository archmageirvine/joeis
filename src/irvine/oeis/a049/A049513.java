package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A049513 Array T by antidiagonals: T(k,n) = k*n*2^(n-1) + 1, n &gt;= 0, k &gt;= 0.
 * @author Sean A. Irvine
 */
public class A049513 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;

  private Z t(final int n, final int m) {
    return Z.valueOf(n * (long) m).shiftLeft(n - 1).add(1);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mM, mN - mM);
  }
}

