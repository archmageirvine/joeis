package irvine.oeis.a141;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A141672 Triangle defined by T(n, k) = (n/k)*MoebiusMu(n) if n mod k is zero and T(n, 0) = n+1, read by rows.
 * @author Georg Fischer
 */
public class A141672 extends Triangle {

  @Override
  public Z compute(final int n, final int k) {
    return k == 0 ? Z.valueOf(n + 1) : (n % k == 0 ? Z.valueOf((long) Functions.MOBIUS.i((long) n) * n / k) : Z.ZERO);
  }
}
