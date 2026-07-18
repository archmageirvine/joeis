package irvine.oeis.a358;

import irvine.math.z.Z;
import irvine.oeis.a212.A212796;

/**
 * A358810 Number of spanning trees in C_5 X C_n.
 * @author Georg Fischer
 */
public class A358810 extends A212796 {

  private long mN;
  private long mRow;

  /** Construct the sequence. */
  public A358810() {
    this(1, 5);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param row
   */
  public A358810(final int offset, final long row) {
    mN = offset - 1;
    mRow = row;
  }

  @Override
  public Z next() {
    ++mN;
    return super.numberOfSpanningTrees(mRow, mN);
  }
}
