package irvine.oeis.a234;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A234575 Triangle T(n,k) read by rows: T(n,k) = floor(n/k) + n mod k, with 1&lt;=k&lt;=n.
 * @author Georg Fischer
 */
public class A234575 extends Triangle {

  @Override
  public Z compute(int n, int k) {
    ++n;
    ++k;
    return Z.valueOf(n / k + n % k);
  }
}
