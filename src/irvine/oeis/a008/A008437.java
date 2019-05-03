package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.a085.A085121;

/**
 * A008437 Expansion of Jacobi theta constant <code>theta_2^3 /8</code>.
 * @author Sean A. Irvine
 */
public class A008437 extends A085121 {

  @Override
  public Z next() {
    return super.next().divide(8);
  }
}
