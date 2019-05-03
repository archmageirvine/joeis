package irvine.oeis.a153;

import irvine.oeis.LinearRecurrence;

/**
 * A153126 Sums of rows of the triangle in <code>A153125</code>.
 * @author Sean A. Irvine
 */
public class A153126 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153126() {
    super(new long[] {1, -2, 0, 2}, new long[] {1, 6, 18, 33});
  }
}
