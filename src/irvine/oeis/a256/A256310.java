package irvine.oeis.a256;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A256310 Number of partitions of 2n into exactly 6 parts.
 * @author Sean A. Irvine
 */
public class A256310 extends LinearRecurrence {

  /** Construct the sequence. */
  public A256310() {
    super(new long[] {-1, 2, 0, 0, -3, 1, 1, 0, 0, 1, 1, -3, 0, 0, 2}, new long[] {0, 0, 0, 1, 2, 5, 11, 20, 35, 58, 90, 136, 199, 282, 391});
  }
}
