package irvine.oeis.a054;

import irvine.oeis.LinearRecurrence;

/**
 * A054457.
 * @author Sean A. Irvine
 */
public class A054457 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054457() {
    super(new long[] {1, 6, 9, -4, -9, 6}, new long[] {1, 6, 27, 104, 366, 1212});
  }
}
