package irvine.oeis.a296;

import irvine.oeis.LinearRecurrence;

/**
 * A296805 Sum of the larger parts in the partitions of n into two distinct parts with the larger part even.
 * @author Sean A. Irvine
 */
public class A296805 extends LinearRecurrence {

  /** Construct the sequence. */
  public A296805() {
    super(new long[] {1, -1, 0, 0, -2, 2, 0, 0, 1}, new long[] {0, 0, 2, 0, 4, 4, 10, 6, 14});
  }
}
