package irvine.oeis.a178;

import irvine.oeis.LinearRecurrence;

/**
 * A178370 The trisection <code>A178242(3n+2)</code>.
 * @author Sean A. Irvine
 */
public class A178370 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178370() {
    super(new long[] {1, -3, 6, -10, 12, -12, 10, -6, 3}, new long[] {7, 25, 26, 44, 133, 187, 125, 161, 403});
  }
}
