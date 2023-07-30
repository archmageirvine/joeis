package irvine.math.partitions;

import java.util.Arrays;

/**
 * Generate integer compositions of exact number of parts.
 * @author Sean A. Irvine
 */
public final class IntegerComposition {

  private final int[] mX;
  private final int mK;
  private boolean mFirst = true;

  /**
   * Construct a new object for getting the integer compositions of a number.
   * @param n number
   * @param parts parts
   * @exception IllegalArgumentException if <code>n</code> is not positive,
   * or <code>parts</code> is out of range for <code>n</code>.
   */
  public IntegerComposition(final int n, final int parts) {
    if (n < 1 || parts < 0 || parts > n) {
      throw new IllegalArgumentException(n + " " + parts);
    }
    mK = parts;
    mX = new int[parts + 1];
    if (parts > 0) {
      Arrays.fill(mX, 1, parts, 1);
      mX[parts] = 0; // not one
    }
    mX[0] = Math.max(1, n - parts + 1);
  }

  /**
   * Return the next integer composition or null of all compositions have been
   * produced.
   *
   * @return integer compositions
   */
  public int[] next() {
    if (mFirst) {
      mFirst = false;
    } else {
      int j = 0;
      while (1 == mX[j]) {
        ++j;
      }
      if (j >= mK - 1) {
        return null;
      }
      final int v = mX[j];
      mX[j] = 1;
      mX[0] = v - 1;
      mX[++j]++;
    }
    return Arrays.copyOf(mX, mK);
  }

  /**
   * Print all integer compositions of given size and parts.
   * @param args arguments
   */
  public static void main(final String[] args) {
    final IntegerComposition ip = new IntegerComposition(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
    int[] comp;
    while ((comp = ip.next()) != null) {
      System.out.println(Arrays.toString(comp));
    }
  }

}

