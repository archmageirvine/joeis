package irvine.oeis.a256;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A256329 Number of partitions of 7n into exactly 4 parts.
 * @author Sean A. Irvine
 */
public class A256329 extends LinearRecurrence {

  /** Construct the sequence. */
  public A256329() {
    super(new long[] {-1, 1, 1, 0, 0, -2, 0, 0, 1, 1}, new long[] {0, 3, 23, 72, 169, 321, 551, 864, 1285, 1815});
  }
}
