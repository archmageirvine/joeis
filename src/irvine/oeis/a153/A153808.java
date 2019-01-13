package irvine.oeis.a153;

import irvine.oeis.LinearRecurrence;

/**
 * A153808.
 * @author Sean A. Irvine
 */
public class A153808 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153808() {
    super(new long[] {1, -3, 3}, new long[] {0, 8, 64});
  }
}
