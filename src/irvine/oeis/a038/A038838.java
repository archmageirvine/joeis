package irvine.oeis.a038;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A038838 Numbers that are divisible by the square of an odd prime.
 * @author Sean A. Irvine
 */
public class A038838 extends Sequence1 {

  private Z mN = Z.EIGHT;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Jaguar.factor(mN.makeOdd()).maxExponent() > 1) {
        return mN;
      }
    }
  }
}
