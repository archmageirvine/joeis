package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041527 Denominators of continued fraction convergents to <code>sqrt(280)</code>.
 * @author Sean A. Irvine
 */
public class A041527 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041527() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 502, 0, 0, 0, 0, 0}, new long[] {1, 1, 3, 4, 11, 15, 491, 506, 1503, 2009, 5521, 7530});
  }
}
