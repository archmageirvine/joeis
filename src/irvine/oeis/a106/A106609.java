package irvine.oeis.a106;

import irvine.oeis.LinearRecurrence;

/**
 * A106609.
 * @author Sean A. Irvine
 */
public class A106609 extends LinearRecurrence {

  /** Construct the sequence. */
  public A106609() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0}, new long[] {0, 1, 1, 3, 1, 5, 3, 7, 1, 9, 5, 11, 3, 13, 7, 15});
  }
}
