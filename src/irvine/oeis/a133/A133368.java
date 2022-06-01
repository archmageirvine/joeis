package irvine.oeis.a133;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A133368 Period 5: 1, 1, 3, 7, 3.
 * @author Sean A. Irvine
 */
public class A133368 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133368() {
    super(new long[] {1, 0, 0, 0, 0}, new long[] {1, 1, 3, 7, 3});
  }
}
