package irvine.oeis.a153;

import irvine.oeis.LinearRecurrence;

/**
 * A153111.
 * @author Sean A. Irvine
 */
public class A153111 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153111() {
    super(new long[] {-1, 26}, new long[] {1, 25});
  }
}
