package irvine.oeis.a181;

import irvine.factor.prime.Fast;
import irvine.math.z.InverseEuler;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A181662 a(n) is the smallest positive integral multiple of 2^n not in the range of the Euler phi function.
 * @author Sean A. Irvine
 */
public class A181662 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.THREE;
  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply2();
    while (!InverseEuler.inversePhi(mA.multiply(mP)).isEmpty()) {
      mP = mPrime.nextPrime(mP);
    }
    return mA.multiply(mP);
  }
}
