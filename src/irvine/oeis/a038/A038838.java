package irvine.oeis.a038;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038838 Numbers that are divisible by the square of an odd prime.
 * @author Sean A. Irvine
 */
public class A038838 implements Sequence {

  private Z mN = Z.EIGHT;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Cheetah.factor(mN.makeOdd()).maxExponent() > 1) {
        return mN;
      }
    }
  }
}
