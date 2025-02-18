package irvine.oeis.a075;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075361 a(n) = the n-th prime with sum of decimal digits = n, or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A075361 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1 || mN % 3 == 0) {
      return Z.ZERO;
    }
    long p = 1;
    long k = 0;
    while (true) {
      p = mPrime.nextPrime(p);
      if (mN == 7 && Functions.DIGIT_SUM.l(p) == mN) {
        System.out.println("XX " + p);
      }
      if (Functions.DIGIT_SUM.l(p) == mN && ++k == mN) {
        return Z.valueOf(p);
      }
    }
  }
}
