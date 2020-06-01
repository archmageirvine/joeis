package irvine.oeis.a008;

import irvine.oeis.LinearRecurrence;

/**
 * A008614 Molien series of 3-dimensional representation of group <code>GL(3,2) (= L(2,7));</code> a simple group of order 168.
 * @author Sean A. Irvine
 */
public class A008614 extends LinearRecurrence {

  /** Construct the sequence. */
  public A008614() {
    super(new long[] {1, 1, 0, -1, -2, -1, 0, 0, 0, 0, 1, 2, 1, 0, -1},
      new long[] {1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 2, 0, 2});
  }
}

