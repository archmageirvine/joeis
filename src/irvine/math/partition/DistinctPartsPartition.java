package irvine.math.partition;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import irvine.math.z.Z;

/**
 * Generate partitions into distinct parts.
 * @author Sean A. Irvine
 */
public class DistinctPartsPartition {

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
   * Iterate over all partitions of a number.
   * @param n number to be partitioned
   * @param start initializes the accumulated value
   * @param f maps <code>(x, a) -> x</code>, where the int array <code>a</code> contains one individual partition
   * @param <A> accumulated type
   * @return final accumulated value
   */
  public static <A> A iterate(final int n, final A start, final BiFunction<A, int[], A> f) {
    A x = start;
    final DistinctPartsPartition ip = new DistinctPartsPartition(n);
    int[] parts;
    while ((parts = ip.next()) != null) {
      x = f.apply(x, parts);
    }
    return x;
  }

  /**
   * Count the partitions of a number that fulfill some condition.
   * @param n number to be partitioned
   * @param cond predicate
   * @return true if the condition is fulfilled and the partition is to be counted, false if it should not be counted
   */
  public static Z count(final int n, final Predicate<int[]> cond) {
    Z count = Z.ZERO;
    final DistinctPartsPartition ip = new DistinctPartsPartition(n);
    int[] p;
    while ((p = ip.next()) != null) {
      if (cond.test(p)) {
        count = count.add(1);
      }
    }
    return count;
  }

  /**
   * Return the next integer partition into distinct parts or null of all partitions have been produced.
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
   * Print all integer partitions into distinct parts of given argument.
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

