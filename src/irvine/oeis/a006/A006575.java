package irvine.oeis.a006;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.nt.mobius.Mobius;
import irvine.oeis.Sequence;

/**
 * A006575.
 * @author Sean A. Irvine
 */
public class A006575 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (final Z dd : Cheetah.factor(mN).divisors()) {
      final int d = dd.intValue();
      if ((d & 1) == 1) {
        sum = sum.add(Z.THREE.pow(mN / d).subtract(1).multiply(Mobius.mobius(d)));
      }
    }
    return sum.divide(2L * mN);
  }
}
