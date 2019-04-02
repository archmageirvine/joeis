package irvine.oeis.a113;

import irvine.oeis.LinearRecurrence;

/**
 * A113441 Second row of A113439.
 * @author Sean A. Irvine
 */
public class A113441 extends LinearRecurrence {

  /** Construct the sequence. */
  public A113441() {
    super(new long[] {1, -20, 38, -28, 9}, new long[] {1, 3, 12, 50, 212});
  }
}
