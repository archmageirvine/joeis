package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062283 Square array read by descending antidiagonals: T(n,k) = floor(n^k/k^n).
 * @author Sean A. Irvine
 */
public class A062283 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  private Z t(final long n, final long m) {
    return Z.valueOf(n).pow(m).divide(Z.valueOf(m).pow(n));
  }

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return t(mM + 1, mN - mM);
  }
}

