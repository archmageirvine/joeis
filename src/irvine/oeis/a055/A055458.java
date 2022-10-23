package irvine.oeis.a055;

import irvine.factor.prime.Fast;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A055458 a(n) = smallest composite solution x to the equation phi(x+2n) = phi(x)+2n.
 * @author Sean A. Irvine
 */
public class A055458 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    mN += 2;
    Z k = Z.THREE;
    while (true) {
      k = k.add(1);
      if (!mPrime.isPrime(k) && Euler.phi(k.add(mN)).equals(Euler.phi(k).add(mN))) {
        return k;
      }
    }
  }
}
