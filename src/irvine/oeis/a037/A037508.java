package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037508.
 * @author Sean A. Irvine
 */
public class A037508 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037508() {
    super(new long[] {-7, 1, 0, 7}, new long[] {1, 9, 63, 442});
  }
}
