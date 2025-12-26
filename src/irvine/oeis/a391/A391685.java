package irvine.oeis.a391;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A391685 Array read by ascending antidiagonals: A(n,k) = (2*n + 1)*2^(2*k+1) - 1 with k &gt;= 0.
 * @author Sean A. Irvine
 */
public class A391685 extends Sequence0 {

  private long mN = 0;
  private long mM = -1;

  private Z t(final long n, final long m) {
    return Z.valueOf(2 *n + 1).shiftLeft(2 * m + 1).subtract(1);
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

