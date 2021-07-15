package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a008.A008850;

/**
 * A048949 Values of y in solutions to sigma(x^2)=y^3, where x are given by A008850.
 * @author Sean A. Irvine
 */
public class A048949 extends A008850 {

  @Override
  protected Z select(final Z x, final Z y) {
    return y;
  }
}

