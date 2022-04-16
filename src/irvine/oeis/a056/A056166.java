package irvine.oeis.a056;

import irvine.factor.factor.Cheetah;
import irvine.factor.prime.Fast;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056166 Numbers which are the product of distinct primes raised to prime powers.
 * @author Sean A. Irvine
 */
public class A056166 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  private boolean is(final long n) {
    final FactorSequence fs = Cheetah.factor(n);
    for (final Z p : fs.toZArray()) {
      if (!mPrime.isPrime(fs.getExponent(p))) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (!is(++mN)) {
      // do nothing
    }
    return Z.valueOf(mN);
  }
}
