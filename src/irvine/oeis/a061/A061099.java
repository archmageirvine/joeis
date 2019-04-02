package irvine.oeis.a061;

import irvine.oeis.LinearRecurrence;

/**
 * A061099 Squares with digital root 1.
 * @author Sean A. Irvine
 */
public class A061099 extends LinearRecurrence {

  /** Construct the sequence. */
  public A061099() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {1, 64, 100, 289, 361});
  }
}
