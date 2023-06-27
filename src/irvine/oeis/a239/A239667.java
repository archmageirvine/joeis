package irvine.oeis.a239;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A239667 Sum of the largest parts of the partitions of 4n into 4 parts.
 * @author Sean A. Irvine
 */
public class A239667 extends LinearRecurrence {

  /** Construct the sequence. */
  public A239667() {
    super(1, new long[] {1, -3, 3, -3, 6, -6, 3, -3, 3}, new long[] {1, 17, 84, 262, 629, 1289, 2370, 4014, 6393});
  }
}
