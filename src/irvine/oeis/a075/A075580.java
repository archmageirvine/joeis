package irvine.oeis.a075;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A075580 Smallest prime p(k) such that the number of distinct prime divisors of all composite numbers between p(k) and p(k+1) is n.
 * @author Sean A. Irvine
 */
public class A075580 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    long p = 1;
    while (true) {
      p = mPrime.nextPrime(p);
      final long q = mPrime.nextPrime(p);
      final FactorSequence fs = new FactorSequence();
      for (long k = p + 1; k < q; ++k) {
        fs.add(k, FactorSequence.COMPOSITE);
      }
      if (Jaguar.factor(fs).omega() == mN) {
        return Z.valueOf(p);
      }
    }
  }
}

