package irvine.oeis.a166;

import irvine.oeis.LinearRecurrence;

/**
 * A166911.
 * @author Sean A. Irvine
 */
public class A166911 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166911() {
    super(new long[] {-1, 4, -6, 4}, new long[] {3, 13, 39, 89});
  }
}
