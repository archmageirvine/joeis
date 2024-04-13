package irvine.oeis.a058;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A058049 Numbers k such that the sum of the digits of the first k primes is a prime.
 * @author Sean A. Irvine
 */
public class A058049 extends A000040 {

  private long mN = 0;
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mSum = mSum.add(Functions.DIGIT_SUM.l(super.next()));
      if (mSum.isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
