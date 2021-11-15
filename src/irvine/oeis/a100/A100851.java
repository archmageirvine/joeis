package irvine.oeis.a100;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A100851 Triangle read by rows: T(n,k) = 2^n * 3^k, 0&lt;=k&lt;=n.
 * @author Georg Fischer
 */
public class A100851 extends Triangle {

  @Override
  public Z compute(final int n, final int k) {
    return Z.ONE.shiftLeft(n).multiply(Z.THREE.pow(k));
  }
}
