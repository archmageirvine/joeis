package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254685 Number of partially ordered partitions of n into parts less than or equal to <code>3,</code> in which the order of adjacent 2's and 3's is unimportant.
 * @author Sean A. Irvine
 */
public class A254685 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254685() {
    super(new long[] {-1, 0, 1, 1, 1}, new long[] {1, 1, 2, 4, 7});
  }
}
