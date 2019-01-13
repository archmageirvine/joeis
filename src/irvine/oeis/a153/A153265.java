package irvine.oeis.a153;

import irvine.oeis.LinearRecurrence;

/**
 * A153265.
 * @author Sean A. Irvine
 */
public class A153265 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153265() {
    super(new long[] {-4, 4, -5, 1}, new long[] {4, 1, -9, -2});
  }
}
