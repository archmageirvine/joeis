package irvine.oeis.a153;

import irvine.oeis.LinearRecurrence;

/**
 * A153260.
 * @author Sean A. Irvine
 */
public class A153260 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153260() {
    super(new long[] {-1, 4, -6, 4}, new long[] {-27, -47, -67, -81});
  }
}
