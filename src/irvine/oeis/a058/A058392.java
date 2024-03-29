package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.a318.A318951;

/**
 * A058392 Number of 6 X 6 matrices with nonnegative integer entries and all row sums equal to n, up to row and column permutation.
 * @author Sean A. Irvine
 */
public class A058392 extends A318951 {

  /** Construct the sequence. */
  public A058392() {
    super(0);
  }

  private int mN = -1;

  @Override
  public Z next() {
    return rowSumMats(6, 6, ++mN);
  }
}

