package irvine.oeis.a132;

import irvine.oeis.LinearRecurrence;

/**
 * A132758.
 * @author Sean A. Irvine
 */
public class A132758 extends LinearRecurrence {

  /** Construct the sequence. */
  public A132758() {
    super(new long[] {1, -3, 3}, new long[] {0, 16, 33});
  }
}
