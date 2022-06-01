package irvine.oeis.a276;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A276106 Number of compositions of n into parts 1, 7, and 8.
 * @author Sean A. Irvine
 */
public class A276106 extends LinearRecurrence {

  /** Construct the sequence. */
  public A276106() {
    super(new long[] {1, 1, 0, 0, 0, 0, 0, 1}, new long[] {1, 1, 1, 1, 1, 1, 1, 2});
  }
}
