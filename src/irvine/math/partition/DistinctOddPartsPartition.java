package irvine.math.partition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Generate partitions into distinct odd parts.
 * @author Sean A. Irvine
 */
public class DistinctOddPartsPartition extends DistinctPartsPartition {

  /**
   * Construct a new object for getting the integer partitions of a number.
   * @param n number
   * @exception IllegalArgumentException if <code>n</code> is not positive.
   */
  public DistinctOddPartsPartition(final int n) {
    super(n);
  }

  /**
   * Return the next integer partition into distinct odd parts or null of all partitions have been produced.
   * @return integer partition or null if no further partition exist
   */
  public int[] next() {
    outer:
    while (true) {
      final int[] p = super.next();
      if (p != null) {
        for (final int v : p) {
          if ((v & 1) == 0) {
            continue outer;
          }
        }
      }
      return p;
    }
  }

  /**
   * Construct all the partitions of the given number into distinct odd parts.
   * @param n number to partition
   * @return partitions
   */
  public static List<int[]> partitions(final int n) {
    final ArrayList<int[]> res = new ArrayList<>();
    final DistinctOddPartsPartition part = new DistinctOddPartsPartition(n);
    int[] p;
    while ((p = part.next()) != null) {
      res.add(p);
    }
    return res;
  }

  /**
   * Print all integer partitions into distinct odd parts of given argument.
   * @param args arguments
   */
  public static void main(final String[] args) {
    final DistinctOddPartsPartition ip = new DistinctOddPartsPartition(Integer.parseInt(args[0]));
    int[] part;
    while ((part = ip.next()) != null) {
      System.out.println(Arrays.toString(part));
    }
  }
}

