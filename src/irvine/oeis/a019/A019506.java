package irvine.oeis.a019;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A019506 Hoax numbers: composite numbers whose digit-sum equals the sum of the digit-sums of its distinct prime factors.
 * @author Sean A. Irvine
 */
public class A019506 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 21;

  @Override
  public Z next() {
    while (true) {
      if (!mPrime.isPrime(++mN)) {
        final long dSum = Functions.DIGIT_SUM.l(mN);
        long pSum = 0;
        for (final Z p : Jaguar.factor(mN).toZArray()) {
          pSum += Functions.DIGIT_SUM.l(p);
          if (pSum > dSum) {
            break;
          }
        }
        if (pSum == dSum) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
