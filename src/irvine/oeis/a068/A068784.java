package irvine.oeis.a068;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068784 Lesser of two consecutive numbers each divisible by a sixth power.
 * @author Sean A. Irvine
 */
public class A068784 extends Sequence1 {

  private long mN = 16766;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(++mN).maxExponent() >= 6 && Jaguar.factor(mN + 1).maxExponent() >= 6) {
        return Z.valueOf(mN);
      }
    }
  }
}
