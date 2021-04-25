package irvine.oeis.a046;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046754 Numbers k such that the square of d(k) (number of divisors) divides k.
 * @author Sean A. Irvine
 */
public class A046754 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.mod(Cheetah.factor(mN).sigma0().square()).isZero()) {
        return mN;
      }
    }
  }
}
