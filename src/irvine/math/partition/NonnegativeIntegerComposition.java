package irvine.math.partition;

import java.util.Arrays;

/**
 * Generate non-negative integer compositions of exact number of parts.
 *
 * @author Sean A. Irvine
 */
public final class NonnegativeIntegerComposition {

  private final int[] mX;
  private final int mK;
  private boolean mFirst = true;

  /**
   * Construct a new object for getting the integer partitions of a number.
   *
   * @param n number
   * @param parts parts
   * @exception IllegalArgumentException if <code>n</code> is not positive,
   * or <code>parts</code> is out of range for <code>n</code>.
   */
  public NonnegativeIntegerComposition(final int n, final int parts) {
    if (n < 1 || parts < 0) {
      throw new IllegalArgumentException(n + " " + parts);
    }
    mK = parts;
    mX = new int[parts + 1];
    mX[0] = n;
  }

  /**
   * Return the next integer partition or null of all partitions have been
   * produced.
   *
   * @return integer partition
   */
  public int[] next() {
    if (mFirst) {
      mFirst = false;
    } else {
      int j = 0;
      while (0 == mX[j]) {
        ++j;
      }
      if (j >= mK - 1) {
        return null;
      }
      final int v = mX[j];
      mX[j] = 0;
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
    final NonnegativeIntegerComposition ip = new NonnegativeIntegerComposition(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
    int[] comp;
    while ((comp = ip.next()) != null) {
      System.out.println(Arrays.toString(comp));
    }
  }

}

