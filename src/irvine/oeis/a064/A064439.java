package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000720;

/**
 * A064439 Numbers n such that sigma(n) - n - 1 = pi(n).
 * @author Sean A. Irvine
 */
public class A064439 extends A000720 {

  @Override
  public Z next() {
    while (true) {
      if (super.next().equals(Jaguar.factor(mN).sigma().subtract(mN).subtract(1))) {
        return mN;
      }
    }
  }
}
