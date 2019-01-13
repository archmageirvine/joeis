package irvine.oeis.a178;

import irvine.oeis.LinearRecurrence;

/**
 * A178947.
 * @author Sean A. Irvine
 */
public class A178947 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178947() {
    super(new long[] {-1, 2, 1, -4, 1, 2}, new long[] {1, 4, 17, 38, 81, 138});
  }
}
