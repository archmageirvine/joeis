package irvine.oeis.a063;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063127 Composite numbers which in base 2 contain their largest proper factor as a substring.
 * @author Sean A. Irvine
 */
public class A063127 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 3;

  @Override
  public Z next() {
    while (true) {
      if ((++mN & 1) == 0) {
        return Z.valueOf(mN);
      }
      if (!mPrime.isPrime(mN) && Long.toBinaryString(mN).contains(Long.toBinaryString(mN / Functions.LPF.l(mN)))) {
        return Z.valueOf(mN);
      }
    }
  }
}
