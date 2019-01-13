package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037763.
 * @author Sean A. Irvine
 */
public class A037763 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037763() {
    super(new long[] {-9, 1, 0, 0, 9}, new long[] {3, 27, 244, 2198, 19785});
  }
}
