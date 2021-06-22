package irvine.oeis.a046;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046763 Numbers that divide the sum of cubes of their divisors.
 * @author Sean A. Irvine
 */
public class A046763 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Cheetah.factor(mN).sigma(3).mod(mN).isZero()) {
        return mN;
      }
    }
  }
}
