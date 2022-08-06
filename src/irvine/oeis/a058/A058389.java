package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.a318.A318951;

/**
 * A058389 Number of 3 X 3 matrices with nonnegative integer entries and all row sums equal to n, up to row and column permutation.
 * @author Sean A. Irvine
 */
public class A058389 extends A318951 {

  private int mN = -1;

  @Override
  public Z next() {
    return rowSumMats(3, 3, ++mN);
  }
}

