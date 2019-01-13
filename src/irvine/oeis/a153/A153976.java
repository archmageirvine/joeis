package irvine.oeis.a153;

import irvine.oeis.LinearRecurrence;

/**
 * A153976.
 * @author Sean A. Irvine
 */
public class A153976 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153976() {
    super(new long[] {-1, 4, -6, 4}, new long[] {8, 28, 72, 152});
  }
}
