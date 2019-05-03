package irvine.oeis.a069;

import irvine.oeis.LinearRecurrence;

/**
 * A069906 Number of pentagons that can be formed with perimeter n. In other words, number of partitions of n into five parts such that the sum of any four is more than the fifth.
 * @author Sean A. Irvine
 */
public class A069906 extends LinearRecurrence {

  /** Construct the sequence. */
  public A069906() {
    super(new long[] {1, 0, -1, 0, -1, -1, 0, 1, 0, 1, 2, 0, 0, 0, 0, -2, -1, 0, -1, 0, 1, 1, 0, 1, 0}, new long[] {0, 0, 0, 0, 0, 1, 1, 2, 2, 4, 5, 8, 9, 14, 16, 23, 25, 35, 39, 52, 57, 74, 81, 103, 111});
  }
}
