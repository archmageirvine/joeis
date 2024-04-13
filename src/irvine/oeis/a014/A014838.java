package irvine.oeis.a014;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A014838 Sum of all the digits of n in every prime base from 2 to n-1.
 * @author Sean A. Irvine
 */
public class A014838 extends Sequence3 {

  private final Fast mPrime = new Fast();
  private long mN = 2;

  @Override
  public Z next() {
    ++mN;
    long sum = 0;
    for (long base = 2; base < mN; base = mPrime.nextPrime(base)) {
      sum += Functions.DIGIT_SUM.l(base, mN);
    }
    return Z.valueOf(sum);
  }
}
