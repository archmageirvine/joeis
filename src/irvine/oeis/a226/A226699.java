package irvine.oeis.a226;

import irvine.oeis.LinearRecurrence;

/**
 * A226699.
 * @author Sean A. Irvine
 */
public class A226699 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226699() {
    super(new long[] {-1, 1523}, new long[] {2, 1523});
  }
}
