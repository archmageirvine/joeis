package irvine.oeis.a121;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A121262 The characteristic function of the multiples of four.
 * @author Sean A. Irvine
 */
public class A121262 extends LinearRecurrence {

  /** Construct the sequence. */
  public A121262() {
    super(new long[] {1, 0, 0, 0}, new long[] {1, 0, 0, 0});
  }
}
