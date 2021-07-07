package irvine.math.partitions;

import java.util.Arrays;

/**
 * Generate integer partitions.  Uses algorithm <code>ZS1</code> described
 * in "Fast Algorithms for Generating Integer Partitions", Zoghbi and
 * Stojmenovic, Intern. J. Computer Math., vol 70, pp. 319--332.
 *
 * @author Sean A. Irvine
 */
public final class DistinctPartsPartition {

  private final int[] mX;
  private int mM;
  private boolean mFirst = true;

  /**
   * Construct a new object for getting the integer partitions of a number.
   * @param n number
   * @exception IllegalArgumentException if <code>n</code> is not positive.
   */
  public DistinctPartsPartition(final int n) {
    if (n < 1) {
      throw new IllegalArgumentException();
    }
    final int m = (int) Math.floor(0.5 * (Math.sqrt(8 * n + 1) - 1));
    mX = new int[m];
    mM = m;
    for (int k = 0; k < m - 1; k++) {
      mX[k] = k + 1;
    }
    mX[m - 1] = n - m * (m - 1) / 2;
  }

  private int[] reverse(final int[] p, final int len) {
    final int[] res = new int[len];
    for (int k = res.length - 1, j = 0; k >= 0; --k, ++j) {
      res[k] = p[j];
    }
    return res;
  }

  /**
   * Return the next integer partition or null of all partitions have been
   * produced.
   *
   * @return integer partition or null if no further partition exist
   */
  public int[] next() {
    if (mFirst) {
      mFirst = false;
      return reverse(mX, mM);
    }
    if (mM == 1) {
      return null;
    }
    if (mX[mM - 1] - mX[mM - 2] > 2) {
      int b = mX[mM - 2] + 1;
      mX[mM - 2] = b;
      int t = mX[mM - 1] - 1;
      int k = mM - 1;
      while (t >= 2 * b + 3) {
        mX[k++] = ++b;
        t -= b;
      }
      mX[k] = t;
      mM = k + 1;
    } else {
      mX[mM - 2] = mX[mM - 2] + mX[mM - 1];
      mX[--mM] = 0;
    }
    return reverse(mX, mM);
  }

  /**
   * Print all integer partitions of given argument.
   * @param args arguments
   */
  public static void main(final String[] args) {
    final DistinctPartsPartition ip = new DistinctPartsPartition(Integer.parseInt(args[0]));
    int[] part;
    while ((part = ip.next()) != null) {
      System.out.println(Arrays.toString(part));
    }
  }
}

