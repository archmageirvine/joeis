package irvine.oeis.a060;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060775 The greatest divisor d|n such that d &lt; n/d, with a(1) = 1.
 * @author Sean A. Irvine
 */
public class A060775 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z max = Z.ONE;
    for (final Z d : Jaguar.factor(++mN).divisors()) {
      if (d.square().longValueExact() < mN) {
        max = max.max(d);
      }
    }
    return max;
  }
}
