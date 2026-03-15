package irvine.oeis.a084;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084190 Least common multiple of {d-1: d &gt; 1 and d divides n}.
 * @author Sean A. Irvine
 */
public class A084190 extends Sequence1 {

  private long mN = 0;

  protected Z t(final Z n) {
    Z lcm = Z.ONE;
    for (final Z d : Jaguar.factor(n).divisors()) {
      if (!d.isOne()) {
        lcm = lcm.lcm(d.subtract(1));
      }
    }
    return lcm;
  }

  @Override
  public Z next() {
    return t(Z.valueOf(++mN));
  }
}
