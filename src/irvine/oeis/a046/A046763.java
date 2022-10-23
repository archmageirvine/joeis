package irvine.oeis.a046;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A046763 Numbers that divide the sum of cubes of their divisors.
 * @author Sean A. Irvine
 */
public class A046763 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Jaguar.factor(mN).sigma(3).mod(mN).isZero()) {
        return mN;
      }
    }
  }
}
