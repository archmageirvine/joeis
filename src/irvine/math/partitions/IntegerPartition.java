package irvine.math.partitions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;

/**
 * Generate integer partitions.  Uses algorithm <code>ZS1</code> described
 * in "Fast Algorithms for Generating Integer Partitions", Zoghbi and
 * Stojmenovic, Intern. J. Computer Math., vol 70, pp. 319--332.
 *
 * @author Sean A. Irvine
 */
public final class IntegerPartition {

  private final int[] mX;
  private boolean mFirst = true;
  private int mM = 0;
  private int mH = 0;

  /**
   * Construct a new object for getting the integer partitions of a number.
   *
   * @param n number
   * @exception IllegalArgumentException if <code>n</code> is not positive.
   */
  public IntegerPartition(final int n) {
    if (n < 1) {
      throw new IllegalArgumentException();
    }
    mX = new int[n];
    Arrays.fill(mX, 1);
    mX[0] = n;
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
      return new int[] {mX[0]};
    }
    if (mX[0] == 1) {
      return null;
    }
    if (mX[mH] == 2) {
      ++mM;
      mX[mH--] = 1;
    } else {
      final int r = --mX[mH];
      int t = mM - mH + 1;
      while (t >= r) {
        mX[++mH] = r;
        t -= r;
      }
      if (t == 0) {
        mM = mH;
      } else {
        mM = mH + 1;
        if (t > 1) {
          mX[++mH] = t;
        }
      }
    }
    return Arrays.copyOf(mX, mM + 1);
  }

  /**
   * Convert a partition into an array with counts with parts of given size.
   * It is assumed the resulting array is large enough. Position 0 of the
   * array is always left as 0.
   *
   * @param partition the partition
   * @param counts the count form
   */
  public static void toCountForm(final int[] partition, final int[] counts) {
    Arrays.fill(counts, 0);
    for (final int p : partition) {
      counts[p]++;
    }
  }

  /**
   * Compute the order of a partition in counts form.
   *
   * @param counts partition in counts form
   * @return order of partition
   */
  public static int ord(final int[] counts) {
    int ord = 1;
    for (int k = 1; k < counts.length; ++k) {
      if (counts[k] > 0) {
        ord = IntegerUtils.lcm(ord, k);
      }
    }
    return ord;
  }

  private static final List<Z> PARTITIONS = new ArrayList<>();

  private static void computeNext() {
    final int n = PARTITIONS.size();
    if (n <= 1) {
      PARTITIONS.add(Z.ONE);
      PARTITIONS.add(Z.ONE);
      return;
    }
    Z p = Z.ZERO;
    long k = 1;
    boolean sign = true;
    while (true) {
      final long delta = k * (3 * k - 1) / 2;
      if (n - delta < 0) {
        break;
      }
      p = p.signedAdd(sign, PARTITIONS.get(n - (int) delta));
      if (n - delta - k < 0) {
        break;
      }
      p = p.signedAdd(sign, PARTITIONS.get(n - (int) (delta + k)));
      ++k;
      sign = !sign;
    }
    PARTITIONS.add(p);
  }

  /**
   * Number of partitions.
   * @param index index to compute number of partitions for
   * @return number of partitions
   */
  public static Z partitions(final int index) {
    if (index < 0) {
      return Z.ZERO;
    }
    while (PARTITIONS.size() <= index) {
      computeNext();
    }
    return PARTITIONS.get(index);
  }

  /**
   * Print all integer partitions of given argument.
   * @param args arguments
   */
  public static void main(final String[] args) {
    final IntegerPartition ip = new IntegerPartition(Integer.parseInt(args[0]));
    int[] part;
    while ((part = ip.next()) != null) {
      System.out.println(Arrays.toString(part));
    }
  }

}

