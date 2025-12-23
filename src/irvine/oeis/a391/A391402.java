package irvine.oeis.a391;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A391402 allocated for Richard Ehrenborg.
 * @author Sean A. Irvine
 */
public class A391402 extends Sequence0 {

  private long mN = 0;
  private long mM = -1;

  private Z t(final long n, final long m) {
    Z sum = Z.ZERO;
    for (long j = 0; j <= n / 2; ++j) {
      final Z t = Binomial.binomial(2 * j , j).multiply(Binomial.binomial(n, 2 * j));
      for (long i = 0; i <= Math.min(n / 2, n - j); ++i) {
        sum = sum.add(t.multiply(Binomial.binomial(2 * n - 2 * i - 2 * j, n - i - j)).multiply(Binomial.binomial(n - i, i)).multiply(Binomial.binomial(i, m)).multiply(Z.NEG_ONE.pow(i - m)).divide(n - i - j + 1));
      }
    }
    return sum;
  }

  @Override
  public Z next() {
    if (2 * ++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mN, mM);
  }
}

