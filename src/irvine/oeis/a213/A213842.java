package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213842 Principal diagonal of the convolution array <code>A213841</code>.
 * @author Sean A. Irvine
 */
public class A213842 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213842() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 24, 101, 264});
  }
}
