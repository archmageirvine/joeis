package irvine.oeis.a000;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.math.Mobius;
import irvine.oeis.Sequence;

/**
 * A000741 Number of compositions of n into 3 ordered relatively prime parts.
 * @author Sean A. Irvine
 */
public class A000741 implements Sequence {

  private long mN = 0;

  protected Z p(final Z n) {
    return n.subtract(2).multiply(n.subtract(1)).divide(2);
  }

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z d : Cheetah.factor(++mN).divisors()) {
      sum = sum.add(p(d).multiply(Mobius.mobius(mN / d.longValue())));
    }
    return sum;
  }
}
