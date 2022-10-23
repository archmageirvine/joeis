package irvine.oeis.a053;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A053050 a(n) = smallest integer m such that Sum_{k=1..m} prime(k) is divisible by n.
 * @author Sean A. Irvine
 */
public class A053050 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long p = 0;
    long m = 0;
    long sum = 0;
    do {
      ++m;
      p = mPrime.nextPrime(p);
      sum += p;
      sum %= mN;
    } while (sum != 0);
    return Z.valueOf(m);
  }
}
