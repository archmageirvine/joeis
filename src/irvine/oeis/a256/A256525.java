package irvine.oeis.a256;

import irvine.oeis.LinearRecurrence;

/**
 * A256525 Number of partitions of <code>3n</code> into at most 5 parts.
 * @author Sean A. Irvine
 */
public class A256525 extends LinearRecurrence {

  /** Construct the sequence. */
  public A256525() {
    super(new long[] {1, -2, 0, 2, -2, 1, 2, -2, -1, 2, -2, 0, 2}, new long[] {1, 3, 10, 23, 47, 84, 141, 221, 333, 480, 674, 918, 1226});
  }
}
