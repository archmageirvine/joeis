package irvine.oeis.a201;

import irvine.oeis.LinearRecurrence;

/**
 * A201633 Numbers a(n) such that sum_{j=0..3} (a(n) + j)^2 is a triangular number.
 * @author Sean A. Irvine
 */
public class A201633 extends LinearRecurrence {

  /** Construct the sequence. */
  public A201633() {
    super(new long[] {1, -1, -34, 34, 1}, new long[] {11, 28, 424, 1001, 14453});
  }
}
