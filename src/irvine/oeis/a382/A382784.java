package irvine.oeis.a382;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A382782.
 * @author Sean A. Irvine
 */
public class A382784 extends A382782 {

  @Override
  protected Z select(final int n, final Q coeff) {
    return coeff.multiply(Functions.FACTORIAL.z(n - 1).shiftLeft(2L * n)).toZ();
  }
}
