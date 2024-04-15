package irvine.oeis.a046;

import irvine.math.LongUtils;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A046642 Numbers k such that k and number of divisors d(k) are relatively prime.
 * @author Sean A. Irvine
 */
public class A046642 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (LongUtils.gcd(Functions.SIGMA0.z(++mN).longValueExact(), mN) == 1) {
        return Z.valueOf(mN);
      }
    }
  }
}
