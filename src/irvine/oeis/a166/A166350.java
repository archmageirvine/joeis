package irvine.oeis.a166;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A166350 Triangle read by rows: T(n,m) = m!, n &gt;= 1.
 * @author Georg Fischer
 */
public class A166350 extends Triangle {

  /** Construct the sequence. */
  public A166350() {
    setOffset(1);
    hasRAM(false);
  }

  @Override
  public Z compute(final int n, final int k) {
    return k == 0 ? Z.ONE : get(n, k - 1).multiply(k + 1);
  }
}
