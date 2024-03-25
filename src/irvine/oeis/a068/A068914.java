package irvine.oeis.a068;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A068914 Square array read by antidiagonals of number of k step walks (each step +-1 starting from 0) which are never more than n or less than 0.
 * @author Sean A. Irvine
 */
public class A068914 extends Sequence0 {

  // After Stefano Spezia

  private long mN = -1;
  private long mM = 0;

  private Z t(final long n, final long m) {
    Z sum = Z.ZERO;
    for (long j = -n / (m + 2); j <= (n + m + 1) / (m + 2); ++j) {
      sum = sum.signedAdd((j & 1) == 0, Binomial.binomial(n, (n + (m + 2) * j) / 2));
    }
    return sum;
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

