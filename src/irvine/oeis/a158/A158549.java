package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158549.
 * @author Sean A. Irvine
 */
public class A158549 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158549() {
    super(new long[] {1, -3, 3}, new long[] {1, 27, 105});
  }
}
