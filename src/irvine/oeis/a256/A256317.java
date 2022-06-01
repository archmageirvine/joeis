package irvine.oeis.a256;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A256317 Number of partitions of 4n into exactly 6 parts.
 * @author Sean A. Irvine
 */
public class A256317 extends LinearRecurrence {

  /** Construct the sequence. */
  public A256317() {
    super(new long[] {-1, 3, -3, 3, -6, 7, -6, 6, -6, 7, -6, 3, -3, 3}, new long[] {0, 0, 2, 11, 35, 90, 199, 391, 709, 1206, 1945, 3009, 4494, 6510});
  }
}
