package irvine.oeis.a265;
// manually 2021-10-13

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A265129 Triangle read by rows, formed as the sum of the two versions of the natural numbers filling an equilateral triangle. 
 * @author Georg Fischer
 */
public class A265129 extends Triangle {

  @Override
  protected Z compute(final int n, final int k) {
    return Z.valueOf(n + 1).square().add(1);
  }
}
