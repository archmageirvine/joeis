package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.a318.A318951;

/**
 * A058194 Number of n-rowed matrices with entries {0,1,2,3} and all row sums 3, up to row and column permutation.
 * @author Sean A. Irvine
 */
public class A058194 extends A318951 {

  private int mN = -1;

  @Override
  public Z next() {
    return rowSumMats(++mN, 3 * mN, 3);
  }
}
