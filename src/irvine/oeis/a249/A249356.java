package irvine.oeis.a249;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A249356 8*A200975(n)-7 where A200975 are the numbers on the diagonals in Ulam's spiral.
 * @author Sean A. Irvine
 */
public class A249356 extends LinearRecurrence {

  /** Construct the sequence. */
  public A249356() {
    super(1, new long[] {1, -2, 1, 0, -1, 2}, new long[] {1, 17, 33, 49, 65, 97});
  }
}
