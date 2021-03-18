package irvine.oeis.a000;

import irvine.factor.factor.Cheetah;
import irvine.math.Mobius;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A000048 Number of n-bead necklaces with beads of 2 colors and primitive period n, when turning over is not allowed but the two colors can be interchanged.
 * @author Sean A. Irvine
 */
public class A000048 implements Sequence {

  protected int mN = -1;

  @Override
  public Z next() {
    if (++mN < 4) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (final Z d : Cheetah.factor(mN).divisors()) {
      final int dd = d.intValue();
      if ((dd & 1) == 1) {
        final Z t = Z.ONE.shiftLeft(mN / dd);
        sum = ZUtils.mobiusAdd(Mobius.mobius(dd), sum, t);
      }
    }
    return sum.divide(2L * mN);
  }

}

