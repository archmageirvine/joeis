package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158394.
 * @author Sean A. Irvine
 */
public class A158394 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158394() {
    super(new long[] {1, -3, 3}, new long[] {727, 2912, 6555});
  }
}
