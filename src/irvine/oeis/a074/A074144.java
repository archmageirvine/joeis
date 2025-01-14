package irvine.oeis.a074;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074144 The differences arising in A075275.
 * @author Sean A. Irvine
 */
public class A074144 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private int mN = 1;

  @Override
  public Z next() {
    while (true) {
      final Z df = Functions.MULTIFACTORIAL.z(++mN);
      final Z hi = mPrime.nextPrime(df);
      final Z lo = mPrime.prevPrime(df);
      if (hi.add(lo).equals(df.multiply2())) {
        return df.subtract(lo);
      }
    }
  }
}
