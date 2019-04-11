package irvine.oeis.a000;

import irvine.factor.factor.Cheetah;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000013 Definition <code>(1)</code>: Number of n-bead binary necklaces with beads of 2 colors where the colors may be swapped but turning over is not allowed.
 * @author Sean A. Irvine
 */
public class A000013 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN < 1) {
      return Z.ONE;
    }
    final Z n = Z.valueOf(mN);
    Z sum = Z.ZERO;
    // divisors below does not include 1
    for (final Z d : Cheetah.factor(n).divisors()) {
      final int ld = d.intValue();
      sum = sum.add(Z.valueOf(LongUtils.phi(2 * ld)).shiftLeft(mN / ld));
    }
    return sum.divide(2L * mN);
  }
}

