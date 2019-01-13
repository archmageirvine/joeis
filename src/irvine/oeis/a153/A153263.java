package irvine.oeis.a153;

import irvine.oeis.LinearRecurrence;

/**
 * A153263.
 * @author Sean A. Irvine
 */
public class A153263 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153263() {
    super(new long[] {1, 2, 0}, new long[] {3, 5, 9});
  }
}
