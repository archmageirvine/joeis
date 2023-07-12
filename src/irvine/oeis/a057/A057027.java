package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A057027 Triangle T read by rows: row n consists of the numbers C(n,2)+1 to C(n+1,2); numbers in odd-numbered places form an increasing sequence and the others a decreasing sequence.
 * numbers in odd-numbered places form an increasing sequence and the others a decreasing sequence.
 * @author Georg Fischer
 */
public class A057027 extends Triangle {

  /** Construct the sequence. */
  public A057027() {
    setOffset(1);
    hasRAM(false);
  }

  private int mRow = 0;

  @Override
  protected void addRow() {
    super.addRow();
    long head = mRow * (mRow + 1) / 2 + 1;
    ++mRow;
    long tail = mRow * (mRow + 1) / 2;
    // System.out.println("addRow, mRow=" + mRow + ", head=" + head + ", tail=" + tail);
    int col = 0;
    while (col < mRow) {
      mLastRow[col++] = Z.valueOf(head++);
      if (col < mRow) {
        mLastRow[col++] = Z.valueOf(tail--);
      }
    }
  }

  @Override
  protected Z compute(final int n, final int k) {
    return n == 0 ? Z.ONE : get(n, k);
  }
}
