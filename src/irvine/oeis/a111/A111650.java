package irvine.oeis.a111;
// manually 2021-10-13

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A111650 2n appears n times (n&gt;0). 
 * @author Georg Fischer
 */
public class A111650 extends Triangle {

  @Override
  protected Z compute(final int n, final int k) {
    return Z.valueOf(n + 1).multiply2();
  }
}
