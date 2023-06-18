package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a062.A062298;

/**
 * A064158.
 * @author Sean A. Irvine
 */
public class A064159 extends A062298 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (super.next().add(Jaguar.factor(mN).sopfr()).equals(mN)) {
        return mN;
      }
    }
  }
}
