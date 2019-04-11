package irvine.oeis.a256;

import irvine.oeis.LinearRecurrence;

/**
 * A256309 Number of partitions of <code>2n</code> into exactly 5 parts.
 * @author Sean A. Irvine
 */
public class A256309 extends LinearRecurrence {

  /** Construct the sequence. */
  public A256309() {
    super(new long[] {1, -2, 0, 1, 1, -1, 0, 1, -1, -1, 0, 2}, new long[] {0, 0, 0, 1, 3, 7, 13, 23, 37, 57, 84, 119});
  }
}
