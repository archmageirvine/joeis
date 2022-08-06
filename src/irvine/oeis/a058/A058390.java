package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.a318.A318951;

/**
 * A058390 Number of 4 X 4 matrices with nonnegative integer entries and all row sums equal to n, up to row and column permutation.
 * @author Sean A. Irvine
 */
public class A058390 extends A318951 {

  private int mN = -1;

  @Override
  public Z next() {
    return rowSumMats(4, 4, ++mN);
  }
}

