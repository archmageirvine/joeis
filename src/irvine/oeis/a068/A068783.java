package irvine.oeis.a068;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068783 Lesser of two consecutive numbers each divisible by a fifth power.
 * @author Sean A. Irvine
 */
public class A068783 extends Sequence1 {

  private long mN = 1214;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(++mN).maxExponent() >= 5 && Jaguar.factor(mN + 1).maxExponent() >= 5) {
        return Z.valueOf(mN);
      }
    }
  }
}
