package irvine.oeis.a053;

import irvine.oeis.LinearRecurrence;

/**
 * A053132.
 * @author Sean A. Irvine
 */
public class A053132 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053132() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {3, 28, 126, 396, 1001, 2184});
  }
}
