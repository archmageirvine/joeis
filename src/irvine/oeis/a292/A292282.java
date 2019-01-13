package irvine.oeis.a292;

import irvine.oeis.LinearRecurrence;

/**
 * A292282.
 * @author Sean A. Irvine
 */
public class A292282 extends LinearRecurrence {

  /** Construct the sequence. */
  public A292282() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 24, 576, 4320, 19200, 63000, 169344});
  }
}
