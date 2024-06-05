package irvine.oeis.a056;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a152.A152175;

/**
 * A056305 Number of primitive (period n) n-bead necklace structures using exactly four different colored beads.
 * @author Sean A. Irvine
 */
public class A056305 extends A152175 {

  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(++mN).divisors()) {
      final int d = dd.intValue();
      final int mu = Functions.MOBIUS.i(mN / d);
      if (mu != 0) {
        sum = sum.signedAdd(mu == 1, t(d, 4));
      }
    }
    return sum;
  }
}
