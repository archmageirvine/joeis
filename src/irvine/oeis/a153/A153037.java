package irvine.oeis.a153;

import irvine.oeis.LinearRecurrence;

/**
 * A153037.
 * @author Sean A. Irvine
 */
public class A153037 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153037() {
    super(new long[] {1, -3, 3}, new long[] {23, 41, 63});
  }
}
