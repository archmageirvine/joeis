package irvine.oeis.a000;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.math.z.Euler;
import irvine.oeis.Sequence;

/**
 * A000029.
 * @author Sean A. Irvine
 */
public class A000029 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN < 4) {
      return Z.valueOf(mN + 1);
    }
    Z sum = Z.ZERO;
    for (final Z d : Cheetah.factor(mN).divisors()) {
      sum = sum.add(Euler.phi(d).shiftLeft(mN / d.intValue()));
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

