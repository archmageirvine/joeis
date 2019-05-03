package irvine.oeis.a205;

import irvine.oeis.LinearRecurrence;

/**
 * A205650 Period <code>12</code>: repeat <code>(1, 6, 8, 6, 1, 9, 8, 3, 1, 3, 8, 9)</code>.
 * @author Sean A. Irvine
 */
public class A205650 extends LinearRecurrence {

  /** Construct the sequence. */
  public A205650() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 6, 8, 6, 1, 9, 8, 3, 1, 3, 8, 9});
  }
}
