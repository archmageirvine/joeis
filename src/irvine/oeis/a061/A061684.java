package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.a275.A275043;

/**
 * A061684 Generalized Bell numbers.
 * @author Georg Fischer
 */
public class A061684 extends A275043 {

  private final int mCol; // column index
  private int mN; // row index
  private int mTri; // current index of triangle element
  private int mStop; // sequenctial index of relevant triangle element

  /** Construct the sequence. */
  public A061684() {
    this(3);
  }

  /**
   * Generic constructor with parameter
   * @param col column index
   */
  public A061684(final int col) {
    mCol = col;
    mN = -1;
    mTri = 0;
    mStop = col * (col + 1) / 2;
  }

  @Override
  public Z next() {
    Z result = super.next();
    while (mTri < mStop) {
      ++mTri;
      result = super.next();
    }
    ++mN;
    mStop += mN + 1 + mCol;
    return result;
  }
}
