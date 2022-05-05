package irvine.oeis.a131;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A131818 A130296 + A002260 - A000012. Triangle read by rows: row n consists of n, 2, 3, 4, ..., n.
 * T(n, 1) = n, T(n, k) = k for k &gt; 1.
 * @author Georg Fischer
 */
public class A131818 extends Triangle {

  /** Construct the sequence. */
  public A131818() {
    hasRAM(true);
  }

  @Override
  public Z compute(final int n, final int k) {
    return Z.valueOf(k == 0 ? n + 1 : k + 1);
  }
}
