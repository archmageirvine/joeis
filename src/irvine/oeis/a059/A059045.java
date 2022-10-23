package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A059045 Square array T(n,k) read by antidiagonals where T(0,k) = 0 and T(n,k) = 1 + 2k + 3k^2 + ... + n*k^(n-1).
 * @author Sean A. Irvine
 */
public class A059045 extends Sequence0 {

  private long mN = -1;
  private long mM = 0;

  private Z t(final long n, final long m) {
    if (m == 1) {
      return Z.valueOf(n * (n + 1) / 2);
    }
    return Z.ONE.add(Z.valueOf(m).pow(n + 1).multiply(n)).subtract(Z.valueOf(m).pow(n).multiply(n + 1)).divide(Z.valueOf(m - 1).square());
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
