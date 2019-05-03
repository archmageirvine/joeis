package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213772 Principal diagonal of the convolution array <code>A213771</code>.
 * @author Sean A. Irvine
 */
public class A213772 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213772() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 11, 42, 106});
  }
}
