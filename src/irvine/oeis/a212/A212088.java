package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212088.
 * @author Sean A. Irvine
 */
public class A212088 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212088() {
    super(new long[] {1, -4, 6, -5, 5, -6, 4}, new long[] {0, 0, 7, 36, 117, 292, 612});
  }
}
