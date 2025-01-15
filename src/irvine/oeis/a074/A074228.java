package irvine.oeis.a074;

import irvine.factor.prime.Fast;
import irvine.math.LongUtils;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074228 Even bases k for which the smallest (Fermat) pseudoprime greater than k has Moebius function mu = -1.
 * @author Sean A. Irvine
 */
public class A074228 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 102;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      long k = mN;
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
