package irvine.oeis.a166;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A166350 Table T(n,m) = m! read by rows.
 * @author Georg Fischer
 */
public class A166350 extends Triangle {

  @Override
  public Z compute(final int n, final int k) {
    return k == 0 ? Z.ONE : get(n, k - 1).multiply(k + 1);
  }
}
