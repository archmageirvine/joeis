package irvine.oeis.a145;

import irvine.math.z.Z;
import irvine.oeis.a064.A064298;

/**
 * A145403 Number of nonintersecting rook paths joining opposite corners of 6 X n board.
 * @author Georg Fischer
 */
public class A145403 extends A064298 {

  private int mN;
  private int mRow;

  /** Construct the sequence. */
  public A145403() {
    this(1, 6);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param row
   */
  public A145403(final int offset, final int row) {
    mN = offset - 1;
    mRow = row;
  }

  @Override
  public Z next() {
    ++mN;
    return super.mB.get(mRow - 1, mN - 1);
  }
}
