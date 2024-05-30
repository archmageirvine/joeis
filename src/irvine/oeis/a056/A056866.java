package irvine.oeis.a056;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.math.LongUtils;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A056866 Orders of non-solvable groups, i.e., numbers that are not solvable numbers.
 * @author Sean A. Irvine
 */
public class A056866 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 56;

  private boolean is(final long n) {
    if (n % 5616 == 0) {
      return true;
    }
    final long v2 = Functions.VALUATION.i(n, 2);
    for (long p = 2; p <= v2; p = mPrime.nextPrime(p)) {
      if (n % ((1L << (2 * p)) - 1) == 0) {
        return true;
      }
    }
    for (long p = 3; p <= Functions.VALUATION.i(n, 3); p = mPrime.nextPrime(p)) {
      if (n % (LongUtils.pow(9, p) / 2) == 0) {
        return true;
      }
    }
    for (long p = 3; p <= v2 / 2; p = mPrime.nextPrime(p)) {
      if (n % (((1L << (2 * p)) + 1) * ((1L << p) - 1)) == 0) {
        return true;
      }
    }
    for (final Z pp : Jaguar.factor(n).toZArray()) {
      final long p = pp.longValue();
      if (p > 3 && p % 5 > 1 && p % 5 < 4 && n % (p * p / 2) == 0) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      mN += 4;
      if (is(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

