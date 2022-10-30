package irvine.oeis.a060;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A060199 Number of primes between n^3 and (n+1)^3.
 * @author Sean A. Irvine
 */
public class A060199 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private long mN = -1;

  @Override
  public Z next() {
    final Z start = Z.valueOf(++mN).pow(3);
    final Z end = Z.valueOf(mN + 1).pow(3);
    long c = 0;
    Z p = mPrime.nextPrime(start);
    while (p.compareTo(end) < 0) {
      ++c;
      p = mPrime.nextPrime(p);
    }
    return Z.valueOf(c);
  }
}
