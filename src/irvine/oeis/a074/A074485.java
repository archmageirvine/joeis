package irvine.oeis.a074;

import irvine.factor.prime.Fast;
import irvine.math.LongUtils;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074228.
 * @author Sean A. Irvine
 */
public class A074485 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 40;

  @Override
  public Z next() {
    while (true) {
      long k = ++mN;
      while (true) {
        ++k;
        if (Functions.GCD.l(mN, k) == 1 && !mPrime.isPrime(k) && LongUtils.modPow(mN, k - 1, k) == 1) {
          if (Functions.MOBIUS.i(k) == -1) {
            return Z.valueOf(mN);
          } else {
            break;
          }
        }
      }
    }
  }
}
