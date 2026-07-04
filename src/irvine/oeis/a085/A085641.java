package irvine.oeis.a085;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085641 Smallest prime == 1 (mod p*q*...*k) where p, q, ..., k are all the distinct prime divisors of n. Or, smallest prime == 1 (mod the largest squarefree divisor of n).
 * @author Sean A. Irvine
 */
public class A085641 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    final long s = Functions.SQUARE_FREE_KERNEL.l(++mN);
    if (s == 1) {
      return Z.TWO;
    }
    long p = 1;
    while (true) {
      p = mPrime.nextPrime(p);
      if (p % s == 1) {
        return Z.valueOf(p);
      }
    }
  }
}
