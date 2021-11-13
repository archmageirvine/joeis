package irvine.oeis.a141;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A141429 Triangle T(n, k) = (k+1)*(n-k+1), read by rows.
 * @author Georg Fischer
 */
public class A141429 extends Triangle {

  @Override
  public Z compute(final int n, final int k) {
    return Z.valueOf(k + 2).multiply(n - k + 1);
  }
}
