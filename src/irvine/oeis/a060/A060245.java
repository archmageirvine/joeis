package irvine.oeis.a060;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a053.A053767;

/**
 * A060245 Primes p such that the sum of the first p composite numbers is itself prime.
 * @author Sean A. Irvine
 */
public class A060245 extends A053767 {

  private final Fast mPrime = new Fast();
  private long mM = 0;
  private long mP = 1;
  {
    setOffset(1);
  }

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      while (mM < mP) {
        ++mM;
        super.next();
      }
      ++mM;
      if (super.next().isProbablePrime()) {
        return Z.valueOf(mP);
      }
    }
  }
}
