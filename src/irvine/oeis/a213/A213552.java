package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213552 Principal diagonal of the convolution array <code>A213551</code>.
 * @author Sean A. Irvine
 */
public class A213552 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213552() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 15, 81, 281, 756, 1722});
  }
}
