package irvine.oeis.a247;

import irvine.oeis.LinearRecurrence;

/**
 * A247617.
 * @author Sean A. Irvine
 */
public class A247617 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247617() {
    super(new long[] {-1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, new long[] {1, 5, 3, 7, 1, 9, 5, 11, 3, 13, 7, 15});
  }
}
