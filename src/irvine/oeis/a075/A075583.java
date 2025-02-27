package irvine.oeis.a075;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075583 Primes p such that the composite numbers between p and the next prime together contain exactly three distinct prime factors.
 * @author Sean A. Irvine
 */
public class A075583 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final int mOmega;
  private long mP = 5;

  protected A075583(final int omega) {
    mOmega = omega;
  }

  /** Construct the sequence. */
  public A075583() {
    this(3);
  }

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      final long q = mPrime.nextPrime(mP);
      final FactorSequence fs = new FactorSequence();
      for (long k = mP + 1; k < q; ++k) {
        fs.add(k, FactorSequence.COMPOSITE);
      }
      if (Jaguar.factor(fs).omega() == mOmega) {
        return Z.valueOf(mP);
      }
    }
  }
}

