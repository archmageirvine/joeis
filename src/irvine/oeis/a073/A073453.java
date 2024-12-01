package irvine.oeis.a073;

import java.util.HashSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073453 Number of distinct remainders arising when n is divided by all primes up to n.
 * @author Sean A. Irvine
 */
public class A073453 extends Sequence1 {

  protected final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final HashSet<Long> res = new HashSet<>();
    for (long p = 2; p <= mN; p = mPrime.nextPrime(p)) {
      res.add(mN % p);
    }
    return Z.valueOf(res.size());
  }
}
