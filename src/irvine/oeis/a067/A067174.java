package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067174 Product of the sum of all the subsets of the numbers from 1 to n.
 * @author Sean A. Irvine
 */
public class A067174 extends Sequence1 {

  private Z mProd = null;
  private int mN = 0;

  private void compute(final int sum, final int n) {
    if (n <= 0) {
      if (sum != 0) {
        mProd = mProd.multiply(sum);
      }
      return;
    }
    compute(sum, n - 1);
    compute(sum + n, n - 1);
  }

  @Override
  public Z next() {
    mProd = Z.ONE;
    compute(0, ++mN);
    return mProd;
  }
}
