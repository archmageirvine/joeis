package irvine.oeis.a153;

import irvine.oeis.LinearRecurrence;

/**
 * A153797.
 * @author Sean A. Irvine
 */
public class A153797 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153797() {
    super(new long[] {1, -3, 3}, new long[] {0, 7, 56});
  }
}
