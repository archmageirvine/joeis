package irvine.oeis.a038;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a002.A002110;

/**
 * A038767 Numbers n for which n-th primorial + square of (n+1)-th prime is also a prime.
 * @author Sean A. Irvine
 */
public class A038767 extends A002110 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.ONE;
  private long mN = -1;
  {
    setOffset(1);
  }

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      final Z a = super.next().add(mP.square());
      if (++mN > 0 && a.isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
