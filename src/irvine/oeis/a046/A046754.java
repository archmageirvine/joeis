package irvine.oeis.a046;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A046754 Numbers k such that the square of d(k) (number of divisors) divides k.
 * @author Sean A. Irvine
 */
public class A046754 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.mod(Jaguar.factor(mN).sigma0().square()).isZero()) {
        return mN;
      }
    }
  }
}
