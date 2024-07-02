package irvine.oeis.a071;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071060 Largest n-digit prime with only prime digits.
 * @author Sean A. Irvine
 */
public class A071060 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    mA = mA.multiply(10).add(7);
    Z t = mA;
    if (t.isProbablePrime()) {
      return t;
    }
    while (true) {
      t = mPrime.prevPrime(t);
      if ((Functions.SYNDROME.i(t) & 0b1101010011) == 0) {
        return t;
      }
    }
  }
}
