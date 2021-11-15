package irvine.oeis.a152;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A152714 Triangle read by rows: T(n,k) = 3^min(k, n-k).
 * @author Georg Fischer
 */
public class A152714 extends Triangle {

  @Override
  public Z compute(final int n, final int k) {
    return Z.THREE.pow(k < n - k ? k : n - k);
  }
}
