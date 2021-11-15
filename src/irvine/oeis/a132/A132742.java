package irvine.oeis.a132;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A132742 Triangle T(n,m) = 1 + ((2*n*3^m) mod 12), read by rows.
 * @author Georg Fischer
 */
public class A132742 extends Triangle {

  @Override
  public Z compute(final int n, final int k) {
    return Z.valueOf(2 * n).multiply(Z.THREE.pow(k)).mod(Z.valueOf(12)).add(1);
  }
}
