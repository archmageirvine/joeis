package irvine.oeis.a069;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A069907 Number of hexagons that can be formed with perimeter n. In other words, partitions of n into six parts such that the sum of any 5 is more than the sixth.
 * @author Sean A. Irvine
 */
public class A069907 extends LinearRecurrence {

  /** Construct the sequence. */
  public A069907() {
    super(new long[] {-1, 0, 1, 1, 1, -1, 0, -1, 0, 0, -1, 0, -1, 1, -1, 1, 1, 1, 1, -1, 1, -1, 0, -1, 0, 0, -1, 0, -1, 1, 1, 1, 0}, new long[] {0, 0, 0, 0, 0, 0, 1, 1, 2, 3, 4, 6, 9, 12, 16, 22, 28, 37, 46, 59, 71, 91, 107, 134, 157, 193, 222, 271, 308, 371, 419, 499, 559});
  }
}
