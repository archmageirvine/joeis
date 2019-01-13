package irvine.oeis.a210;

import irvine.oeis.LinearRecurrence;

/**
 * A210527.
 * @author Sean A. Irvine
 */
public class A210527 extends LinearRecurrence {

  /** Construct the sequence. */
  public A210527() {
    super(new long[] {1, -3, 3}, new long[] {83, 131, 197});
  }
}
