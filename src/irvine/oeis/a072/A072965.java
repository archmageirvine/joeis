package irvine.oeis.a072;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072965 In prime factorization of n replace all matching twin prime pairs with 1, where (3,5)-matches are replaced before (5,7).
 * @author Sean A. Irvine
 */
public class A072965 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    long m = mN;
    for (final Z pp : fs.toZArray()) {
      final long p = pp.longValue();
      if (mPrime.isPrime(p + 2)) {
        while (m % p == 0 && m % (p + 2) == 0) {
          m /= p;
          m /= p + 2;
        }
      }
    }
    return Z.valueOf(m);
  }
}

