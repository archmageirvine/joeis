package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063137 Composite numbers not divisible by 2, 3 or 5 which contain their largest prime factor as a substring in base 2.
 * @author Sean A. Irvine
 */
public class A063137 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mAdd = 4;
  private long mN = 5;

  @Override
  public Z next() {
    while (true) {
      mAdd = 6 - mAdd;
      mN += mAdd;
      if (mN % 5 != 0 && !mPrime.isPrime(mN) && Long.toBinaryString(mN).contains(Jaguar.factor(mN).largestPrimeFactor().toString(2))) {
        return Z.valueOf(mN);
      }
    }
  }
}
