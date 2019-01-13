package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037685.
 * @author Sean A. Irvine
 */
public class A037685 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037685() {
    super(new long[] {-8, 1, 0, 0, 8}, new long[] {1, 8, 67, 538, 4305});
  }
}
