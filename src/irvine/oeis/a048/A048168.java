package irvine.oeis.a048;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A048168 n is divisible by the square of the number of unitary divisors of n (A034444).
 * @author Sean A. Irvine
 */
public class A048168 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.mod(Z.ONE.shiftLeft(2 * Cheetah.factor(mN).omega())).isZero()) {
        return mN;
      }
    }
  }
}

