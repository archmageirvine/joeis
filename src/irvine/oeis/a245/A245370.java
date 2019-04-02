package irvine.oeis.a245;

import irvine.oeis.LinearRecurrence;

/**
 * A245370 Number of compositions of n into parts 3, 5 and 9.
 * @author Sean A. Irvine
 */
public class A245370 extends LinearRecurrence {

  /** Construct the sequence. */
  public A245370() {
    super(new long[] {1, 0, 0, 0, 1, 0, 1, 0, 0}, new long[] {1, 0, 0, 1, 0, 1, 1, 0, 2});
  }
}
