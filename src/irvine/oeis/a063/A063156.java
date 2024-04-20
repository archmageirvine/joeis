package irvine.oeis.a063;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063156 Composite numbers which in base 6 contain their largest proper factor as a substring.
 * @author Sean A. Irvine
 */
public class A063156 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 7;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (!mPrime.isPrime(mN) && Long.toString(mN, 6).contains(Long.toString(mN / Functions.LPF.l(mN), 6))) {
        return Z.valueOf(mN);
      }
    }
  }
}
