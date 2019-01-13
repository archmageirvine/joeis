package irvine.oeis.a045;

import irvine.oeis.LinearRecurrence;

/**
 * A045794.
 * @author Sean A. Irvine
 */
public class A045794 extends LinearRecurrence {

  /** Construct the sequence. */
  public A045794() {
    super(new long[] {1, 0, 0, 1, 0, 0, 3, 0, 0}, new long[] {1, 1, 1, 3, 3, 4, 9, 11, 13});
  }
}
