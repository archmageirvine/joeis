package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158544.
 * @author Sean A. Irvine
 */
public class A158544 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158544() {
    super(new long[] {1, -3, 3}, new long[] {23, 95, 215});
  }
}
