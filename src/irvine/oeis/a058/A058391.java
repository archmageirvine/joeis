package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.a318.A318951;

/**
 * A058391 Number of 5 X 5 matrices with nonnegative integer entries and all row sums equal to n, up to row and column permutation.
 * @author Sean A. Irvine
 */
public class A058391 extends A318951 {

  /** Construct the sequence. */
  public A058391() {
    super(0);
  }

  private int mN = -1;

  @Override
  public Z next() {
    return rowSumMats(5, 5, ++mN);
  }
}

