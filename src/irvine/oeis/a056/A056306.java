package irvine.oeis.a056;

import irvine.factor.factor.Cheetah;
import irvine.math.Mobius;
import irvine.math.z.Z;
import irvine.oeis.a152.A152175;

/**
 * A056306 Number of primitive (period n) n-bead necklace structures using exactly five different colored beads.
 * @author Sean A. Irvine
 */
public class A056306 extends A152175 {

  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z dd : Cheetah.factor(++mN).divisors()) {
      final int d = dd.intValue();
      final int mu = Mobius.mobius(mN / d);
      if (mu != 0) {
        sum = sum.signedAdd(mu == 1, t(d, 5));
      }
    }
    return sum;
  }
}
