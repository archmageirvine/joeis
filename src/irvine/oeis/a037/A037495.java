package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037495.
 * @author Sean A. Irvine
 */
public class A037495 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037495() {
    super(new long[] {-10, 1, 10}, new long[] {2, 21, 212});
  }
}
