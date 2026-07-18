package irvine.oeis.a111;

import irvine.math.z.Z;
import irvine.oeis.a145.A145515;

/**
 * A111827 Number of partitions of 6^n into powers of 6, also equals the row sums of triangle A111825, which shifts columns left and up under matrix 6th power.
 * @author Georg Fischer
 */
public class A111827 extends A145515 {

  private int mN;
  private int mCol;

  /** Construct the sequence. */
  public A111827() {
    this(0, 6);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param col
   */
  public A111827(final int offset, final int col) {
    mN = offset - 1;
    mCol = col;
  }

  @Override
  public Z next() {
    ++mN;
    return super.t(mN, mCol);
  }
}
