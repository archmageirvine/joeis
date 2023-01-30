package irvine.oeis.a061;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A061235 Number of primes between n^4 and (n+1)^4.
 * @author Sean A. Irvine
 */
public class A061235 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private long mN = -1;

  @Override
  public Z next() {
    final Z start = Z.valueOf(++mN).pow(4);
    final Z end = Z.valueOf(mN + 1).pow(4);
    long c = 0;
    Z p = mPrime.nextPrime(start);
    while (p.compareTo(end) < 0) {
      ++c;
      p = mPrime.nextPrime(p);
    }
    return Z.valueOf(c);
  }
}
