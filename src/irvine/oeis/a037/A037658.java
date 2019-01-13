package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037658.
 * @author Sean A. Irvine
 */
public class A037658 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037658() {
    super(new long[] {-9, 1, 0, 9}, new long[] {3, 27, 245, 2208});
  }
}
