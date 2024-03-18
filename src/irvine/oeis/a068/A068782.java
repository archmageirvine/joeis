package irvine.oeis.a068;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068782 Lesser of two consecutive numbers each divisible by a fourth power.
 * @author Sean A. Irvine
 */
public class A068782 extends Sequence1 {

  private long mN = 79;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(++mN).maxExponent() >= 4 && Jaguar.factor(mN + 1).maxExponent() >= 4) {
        return Z.valueOf(mN);
      }
    }
  }
}
