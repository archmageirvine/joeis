package irvine.oeis.a341;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A341315 Triangle read by rows: T(n,k) = (n+k)/gcd(n,k), n&gt;=0, 0&lt;=k&lt;=n.
 * @author Georg Fischer
 */
public class A341315 extends Triangle {

  @Override
  public Z compute(final int n, final int k) {
    return n == 0 ? Z.ZERO : (k == 0 ? Z.ONE : Z.valueOf(n + k).divide(LongUtils.gcd(n, k)));
  }
}
