package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.a005.A005988;

/**
 * A055735 The x value of the unique nontrivial solution to x^3 + d*y^3 = 1 for all admissible (d = 2,7,9,17,..., A005988).
 * @author Sean A. Irvine
 */
public class A055735 extends A005988 {

  @Override
  protected Z getReturnValue(final long d, final Z x, final long y3) {
    return x;
  }
}
