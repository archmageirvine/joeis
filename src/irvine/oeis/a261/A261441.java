package irvine.oeis.a261;

import irvine.oeis.LinearRecurrence;

/**
 * A261441.
 * @author Sean A. Irvine
 */
public class A261441 extends LinearRecurrence {

  /** Construct the sequence. */
  public A261441() {
    super(new long[] {-1, 3, -6, 10, -12, 12, -10, 5}, new long[] {0, 1, 5, 15, 35, 73, 144, 274});
  }
}
