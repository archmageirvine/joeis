package irvine.oeis.a141;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A141042 Product of n and the n-th gap between primes: a(n) = n*A001223(n).
 * @author Sean A. Irvine
 */
public class A141042 extends Sequence1 {

  private long mN = 0;
  private final Fast mPrime = new Fast();
  private Z mP = Z.TWO;

  @Override
  public Z next() {
    final Z next = mPrime.nextPrime(mP);
    final Z gap = next.subtract(mP);
    mP = next;
    return gap.multiply(++mN);
  }
}
