package irvine.oeis.a290;

import irvine.math.z.Z;
import irvine.oeis.a296.A296546;

/**
 * A290324 Number of (undirected) paths in the complete tripartite graph K_{n,n,n}.
 * @author Gregory Morse
 */
public class A290324 extends A296546 {
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 1; k <= mN; ++k) {
      for (int i = 0; i <= k; ++i) {
        for (int j = 0; j <= k - i; ++j) {
          for (int p = k - i - j; p <= mN - Math.max(i, j); ++p) {
            sum = sum.add(count(mN, k, i, j, p).multiply(k).multiply(1 + mN - k));
          }
        }
      }
    }
    return sum.multiply(3).divide2();
  }
}
