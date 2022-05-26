package irvine.oeis.a328;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A328817 Numbers k such that at least 7 of k, k+1, ..., k+9 are divisible by their least prime factor squared.
 * @author Sean A. Irvine
 */
public class A328817 implements Sequence {

  private long mN = 1;

  private boolean isSquareLeastPrimeFactor(final long n) {
    final FactorSequence fs = Jaguar.factor(n);
    return fs.getExponent(fs.leastPrimeFactor()) > 1;
  }

  private boolean isSquareLeastPrimeFactor(final long n, final long steps, final int minCount) {
    int c = 0;
    for (long k = n; k < n + steps; ++k) {
      if (isSquareLeastPrimeFactor(k) && ++c == minCount) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      if (isSquareLeastPrimeFactor(++mN, 10, 7)) {
        return Z.valueOf(mN);
      }
    }
  }
}
