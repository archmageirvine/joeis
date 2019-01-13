package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133694.
 * @author Sean A. Irvine
 */
public class A133694 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133694() {
    super(new long[] {1, -3, 3}, new long[] {1, 7, 16});
  }
}
