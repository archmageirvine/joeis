package irvine.oeis.a046;

import irvine.factor.factor.Cheetah;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046642 Numbers k such that k and number of divisors d(k) are relatively prime.
 * @author Sean A. Irvine
 */
public class A046642 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (LongUtils.gcd(Cheetah.factor(++mN).sigma0().longValueExact(), mN) == 1) {
        return Z.valueOf(mN);
      }
    }
  }
}
