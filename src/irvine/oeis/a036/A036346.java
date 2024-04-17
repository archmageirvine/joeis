package irvine.oeis.a036;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A036346 Composites n such that A001414(n) is odd and divides n.
 * @author Sean A. Irvine
 */
public class A036346 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 26;

  @Override
  public Z next() {
    while (true) {
      if (!mPrime.isPrime(++mN)) {
        final Z sum = Functions.SOPFR.z(mN);
        if (sum.isOdd() && mN % sum.longValueExact() == 0) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
