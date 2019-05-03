package irvine.oeis.a205;

import irvine.oeis.LinearRecurrence;

/**
 * A205184 Period <code>12</code>: repeat <code>(1, 8, 4, 9, 7, 8, 7, 9, 4, 8, 1, 9)</code>.
 * @author Sean A. Irvine
 */
public class A205184 extends LinearRecurrence {

  /** Construct the sequence. */
  public A205184() {
    super(new long[] {1, 0, -1, 0, 0, 0, 1, 0}, new long[] {1, 8, 4, 9, 7, 8, 7, 9});
  }
}
