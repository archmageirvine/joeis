package irvine.oeis.a168;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A168281 Triangle T(n,m) = 2*(min(n - m + 1, m))^2 read by rows.
 * @author Georg Fischer
 */
public class A168281 extends Triangle {

  @Override
  public Z compute(final int n, final int k) {
    return Z.valueOf(LongUtils.min(n - k + 1, k + 1)).square().multiply2();
  }
}
