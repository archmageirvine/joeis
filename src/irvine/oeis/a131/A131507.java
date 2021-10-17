package irvine.oeis.a131;
// manually 2021-10-13

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A131507 2n+1 appears n+1 times.
 * @author Georg Fischer
 */
public class A131507 extends Triangle {

  @Override
  protected Z compute(final int n, final int k) {
    return Z.valueOf(n).multiply2().add(1);
  }
}
