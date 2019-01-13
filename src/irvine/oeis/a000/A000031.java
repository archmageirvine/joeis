package irvine.oeis.a000;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.math.z.Euler;
import irvine.oeis.Sequence;

/**
 * A000031.
 * @author Sean A. Irvine
 */
public class A000031 implements Sequence {

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
    return sum.divide(mN);
  }

}

