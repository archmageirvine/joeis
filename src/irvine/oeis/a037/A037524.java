package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037524.
 * @author Sean A. Irvine
 */
public class A037524 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037524() {
    super(new long[] {-7, 1, 0, 7}, new long[] {2, 15, 105, 737});
  }
}
