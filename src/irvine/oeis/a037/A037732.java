package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037732.
 * @author Sean A. Irvine
 */
public class A037732 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037732() {
    super(new long[] {-6, 1, 0, 0, 6}, new long[] {2, 13, 78, 471, 2828});
  }
}
