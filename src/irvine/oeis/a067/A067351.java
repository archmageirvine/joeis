package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a065.A065387;

/**
 * A067351 Numbers n such that sigma(n) + phi(n) has exactly 2 distinct prime divisors.
 * @author Sean A. Irvine
 */
public class A067351 extends A065387 {

  @Override
  public Z next() {
    while (true) {
      if (Functions.OMEGA.i(super.next()) == 2) {
        return Z.valueOf(mN);
      }
    }
  }
}
