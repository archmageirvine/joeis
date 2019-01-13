package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037580.
 * @author Sean A. Irvine
 */
public class A037580 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037580() {
    super(new long[] {-8, 1, 8}, new long[] {1, 11, 89});
  }
}
