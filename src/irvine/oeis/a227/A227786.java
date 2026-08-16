package irvine.oeis.a227;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A227786 Take squares larger than 1, subtract 3 from even squares and 2 from odd squares.
 * @author Sean A. Irvine
 */
public class A227786 extends LinearRecurrence {

  /** Construct the sequence. */
  public A227786() {
    super(1, new long[] {1, -2, 0, 2}, new long[] {1, 7, 13, 23});
  }
}
