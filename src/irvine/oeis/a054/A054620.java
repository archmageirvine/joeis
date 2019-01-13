package irvine.oeis.a054;

import irvine.oeis.LinearRecurrence;

/**
 * A054620.
 * @author Sean A. Irvine
 */
public class A054620 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054620() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 1, 8, 51, 208, 629});
  }
}
