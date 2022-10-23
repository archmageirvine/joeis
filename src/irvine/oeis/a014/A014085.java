package irvine.oeis.a014;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A014085 Number of primes between n^2 and (n+1)^2.
 * @author Sean A. Irvine
 */
public class A014085 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private long mN = -1;

  @Override
  public Z next() {
    final Z start = Z.valueOf(++mN).square();
    final Z end = Z.valueOf(mN + 1).square();
    long c = 0;
    Z p = mPrime.nextPrime(start);
    while (p.compareTo(end) < 0) {
      ++c;
      p = mPrime.nextPrime(p);
    }
    return Z.valueOf(c);
  }
}
