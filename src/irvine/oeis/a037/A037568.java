package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037568.
 * @author Sean A. Irvine
 */
public class A037568 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037568() {
    super(new long[] {-3, 1, 0, 3}, new long[] {2, 7, 23, 71});
  }
}
