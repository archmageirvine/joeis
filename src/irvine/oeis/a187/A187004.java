package irvine.oeis.a187;

import irvine.oeis.LinearRecurrence;

/**
 * A187004.
 * @author Sean A. Irvine
 */
public class A187004 extends LinearRecurrence {

  /** Construct the sequence. */
  public A187004() {
    super(new long[] {1, 2, 3, 3, 2, 1}, new long[] {1, 5, 16, 41, 101, 254});
  }
}
