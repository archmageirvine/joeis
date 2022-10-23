package irvine.oeis.a056;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A056809 Numbers k such that k, k+1 and k+2 are products of two primes.
 * @author Sean A. Irvine
 */
public class A056809 extends Sequence1 {

  private long mN = 32;

  private boolean isSemiprime(final long n) {
    final int a = Jaguar.factor(n).isSemiprime();
    if (n == FactorSequence.UNKNOWN) {
      throw new UnsupportedOperationException();
    }
    return a == FactorSequence.YES;
  }

  @Override
  public Z next() {
    while (true) {
      if (isSemiprime(++mN) && isSemiprime(mN + 1) && isSemiprime(mN + 2)) {
        return Z.valueOf(mN);
      }
    }
  }
}

