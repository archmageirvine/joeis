package irvine.oeis.a141;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A141662 Triangle read by rows, T(n,m) = abs(n - m^2).
 * @author Georg Fischer
 */
public class A141662 extends Triangle {

  @Override
  public Z compute(final int n, final int k) {
    return Z.valueOf(n - k * k).abs();
  }
}
