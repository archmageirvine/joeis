package irvine.oeis.a058;

import irvine.factor.prime.Fast;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058887 Smallest prime p such that (2^n)*p is a nontotient number.
 * @author Sean A. Irvine
 */
public class A058887 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mP = Z.THREE;
  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply2();
    while (!Euler.inversePhi(mA.multiply(mP)).isEmpty()) {
      mP = mPrime.nextPrime(mP);
    }
    return mP;
  }
}
