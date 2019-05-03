package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213782 Principal diagonal of the convolution array <code>A213781</code>.
 * @author Sean A. Irvine
 */
public class A213782 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213782() {
    super(new long[] {-1, 2, 1, -4, 1, 2}, new long[] {1, 7, 19, 41, 72, 118});
  }
}
