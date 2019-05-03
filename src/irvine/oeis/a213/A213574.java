package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213574 Principal diagonal of the convolution array <code>A213573</code>.
 * @author Sean A. Irvine
 */
public class A213574 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213574() {
    super(new long[] {-8, 36, -66, 63, -33, 9}, new long[] {1, 17, 93, 349, 1093, 3093});
  }
}
