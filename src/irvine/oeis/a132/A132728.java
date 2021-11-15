package irvine.oeis.a132;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A132728 Triangle T(n, k) = 4 - 3*(-1)^k, read by rows.
 * @author Georg Fischer
 */
public class A132728 extends Triangle {

  @Override
  public Z compute(final int n, final int k) {
    return Z.FOUR.subtract(((k & 1) == 0) ? 3 : -3);
  }
}
