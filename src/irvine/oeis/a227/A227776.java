package irvine.oeis.a227;

import irvine.oeis.LinearRecurrence;

/**
 * A227776 a(n) = 6*n^2 + 1.
 * @author Sean A. Irvine
 */
public class A227776 extends LinearRecurrence {

  /** Construct the sequence. */
  public A227776() {
    super(new long[] {1, -3, 3}, new long[] {7, 25, 55});
  }
}
