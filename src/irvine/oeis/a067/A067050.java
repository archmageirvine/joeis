package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A067050 Triangle T(n,r), n&gt;=0, r=n, n-1, ..., 1, 0; where T(n,r) = product of all possible sums of r numbers chosen from [1..n].
 * @author Sean A. Irvine
 */
public class A067050 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;

  private boolean bump(final int[] sum) {
    for (int k = sum.length - 1; k >= 0; --k) {
      if (++sum[k] <= mN - (sum.length - k - 1)) {
        for (int j = k + 1; j < sum.length; ++j) {
          sum[j] = sum[j - 1] + 1;
        }
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    if (--mM < 0) {
      mM = ++mN;
    }
    Z prod = Z.ONE;
    if (mM > 0) {
      final int[] sum = new int[mM];
      for (int k = 0; k < sum.length; ++k) {
        sum[k] = k + 1;
      }
      do {
        prod = prod.multiply(Functions.SUM.l(sum));
      } while (bump(sum));
    }
    return prod;
  }
}
