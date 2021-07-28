package irvine.oeis.a039;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A039951 a(n) is the smallest prime p such that p^2 divides n^(p-1) - 1.
 * @author Sean A. Irvine
 */
public class A039951 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    Z p = Z.ONE;
    while (true) {
      p = mPrime.nextPrime(p);
      final Z p2 = p.square();
      if (mN.modPow(p.subtract(1), p2).equals(Z.ONE)) {
        return p;
      }
    }
  }
}
