package irvine.oeis.a227;

import irvine.oeis.LinearRecurrence;

/**
 * A227708.
 * @author Sean A. Irvine
 */
public class A227708 extends LinearRecurrence {

  /** Construct the sequence. */
  public A227708() {
    super(new long[] {64, -160, 148, -64, 13}, new long[] {84, 354, 1674, 8178, 39858});
  }
}
