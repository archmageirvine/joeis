package irvine.oeis.a074;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074176 Differences between n!!! and the nearest prime.
 * @author Sean A. Irvine
 */
public class A074176 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private int mN = 1;

  @Override
  public Z next() {
    while (true) {
      final Z df = Functions.MULTIFACTORIAL.z(3, ++mN);
      final Z hi = mPrime.nextPrime(df);
      final Z lo = mPrime.prevPrime(df);
      if (hi.add(lo).equals(df.multiply2())) {
        return df.subtract(lo);
      }
    }
  }
}
