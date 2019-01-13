package irvine.oeis.a153;

import irvine.oeis.LinearRecurrence;

/**
 * A153448.
 * @author Sean A. Irvine
 */
public class A153448 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153448() {
    super(new long[] {1, -3, 3}, new long[] {0, 3, 36});
  }
}
