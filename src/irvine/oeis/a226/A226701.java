package irvine.oeis.a226;

import irvine.oeis.LinearRecurrence;

/**
 * A226701.
 * @author Sean A. Irvine
 */
public class A226701 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226701() {
    super(new long[] {-1, 1523}, new long[] {1, 1524});
  }
}
