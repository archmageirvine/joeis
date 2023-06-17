package irvine.oeis.a000;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000029 Number of necklaces with n beads of 2 colors, allowing turning over (these are also called bracelets).
 * @author Sean A. Irvine
 */
public class A000029 extends AbstractSequence {

  /* Construct the sequence. */
  public A000029() {
    super(0);
  }

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN < 4) {
      return Z.valueOf(mN + 1);
    }
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(mN).divisors()) {
      sum = sum.add(Euler.phi(d).shiftLeft(mN / d.longValue()));
    }
    sum = sum.divide(2L * mN);
    if ((mN & 1) == 0) {
      sum = sum.add(Z.THREE.shiftLeft(mN / 2 - 2));
    } else {
      sum = sum.add(Z.ONE.shiftLeft((mN - 1) / 2));
    }
    return sum;
  }

}

