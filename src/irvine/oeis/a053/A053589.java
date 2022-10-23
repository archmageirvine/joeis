package irvine.oeis.a053;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A053589 Greatest primorial number (A002110) which divides n.
 * @author Sean A. Irvine
 */
public class A053589 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 1;
    long p = 2;
    while (mN % p == 0) {
      k *= p;
      p = mPrime.nextPrime(p);
    }
    return Z.valueOf(k);
  }
}
