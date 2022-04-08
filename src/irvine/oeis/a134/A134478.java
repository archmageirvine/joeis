package irvine.oeis.a134;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A134478 Triangle read by rows, T(0,0) = 1; n-th row = (n+1) terms of n, n+1, n+2, ...
 * @author Georg Fischer
 */
public class A134478 extends Triangle {

  @Override
  public Z compute(final int n, final int k) {
    return n == 0 ? Z.ONE : Z.valueOf(n + k);
  }
}
