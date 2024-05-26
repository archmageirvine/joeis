package irvine.oeis.a069;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069831.
 * @author Sean A. Irvine
 */
public class A069837 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    mA = mA.multiply(10).add(2); // 222...
    if (Z.TWO.equals(mA)) {
      return Z.TWO; // only case where we do not need to step
    }
    Z t = mA;
    while (true) {
      t = mPrime.nextPrime(t);
      // Keep going until we find a prime with only digits 2, 3, 5, 7
      if ((Functions.SYNDROME.i(t) & 0b1101010011) == 0) {
        return t;
      }
    }
  }
}

