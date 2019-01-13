package irvine.oeis.a226;

import irvine.oeis.LinearRecurrence;

/**
 * A226700.
 * @author Sean A. Irvine
 */
public class A226700 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226700() {
    super(new long[] {-1, 1523}, new long[] {0, 1});
  }
}
