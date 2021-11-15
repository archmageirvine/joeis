package irvine.oeis.a140;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A140303 Triangle T(n,k) = 3^(n-k) read by rows.
 * @author Georg Fischer
 */
public class A140303 extends Triangle {

  @Override
  public Z compute(final int n, final int k) {
    return Z.THREE.pow(n - k);
  }
}
