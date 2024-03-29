package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158394 729n^2 - 2n.
 * @author Sean A. Irvine
 */
public class A158394 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158394() {
    super(1, new long[] {1, -3, 3}, new long[] {727, 2912, 6555});
  }
}
