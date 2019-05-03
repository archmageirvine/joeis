package irvine.oeis.a259;

import irvine.math.z.Z;
import irvine.oeis.a005.A005988;

/**
 * A259453 The y value of the unique nontrivial solution to <code>x^3 + d*y^3 = 1</code> for all admissible <code>(d = 2,7,9,17,..., A005988)</code>.
 * @author Sean A. Irvine
 */
public class A259453 extends A005988 {

  @Override
  protected Z getReturnValue(final long d, final Z x, final long y3) {
    return Z.valueOf(y3).root(3);
  }
}
