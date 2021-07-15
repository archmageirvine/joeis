package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a008.A008849;

/**
 * A048948 Values of y in solutions to sigma(x^3)=y^2, where x are given by A008849.
 * @author Sean A. Irvine
 */
public class A048948 extends A008849 {

  @Override
  protected Z select(final Z x, final Z y2) {
    return y2.sqrt();
  }
}

