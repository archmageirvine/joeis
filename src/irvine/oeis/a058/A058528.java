package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.a008.A008300;

/**
 * A058528 Number of n X n (0,1) matrices with all column and row sums equal to 4.
 * @author Sean A. Irvine
 */
public class A058528 extends A008300 {

  private int mCol;
  private int mN;

  /** Construct the sequence. */
  public A058528() {
    this(0, 4);
  }

  /**
   * Generic constructor with parameters.
   * @param offset first index
   * @param colNo column number
   */
  public A058528(final int offset, final int col) {
    super(offset);
    mN = offset - 1;
    mCol = col;
  }

  @Override
  public Z next() {
    return t(++mN, mCol);
  }
}
