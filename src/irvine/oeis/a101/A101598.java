package irvine.oeis.a101;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.triangle.Triangle;

/**
 * A101598 Triangle read by rows: T(n,k) = number of distinct digits in decimal representation of binomial(n,k), 0&lt;=k&lt;=n.
 * @author Georg Fischer
 */
public class A101598 extends Triangle {

  @Override
  public Z compute(final int n, final int k) {
    final int[] counts = ZUtils.digitCounts(Binomial.binomial(n, k));
    int num = 0;
    for (int i = counts.length - 1; i >= 0; --i) {
      if (counts[i] != 0) {
        ++num;
      }
    }
    return Z.valueOf(num);
  }
}
