package irvine.oeis.a187;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A187673 Partial sums of the tricapped prism numbers A005920.
 * @author Sean A. Irvine
 */
public class A187673 extends LinearRecurrence {

  /** Construct the sequence. */
  public A187673() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 10, 43, 125, 290});
  }
}
