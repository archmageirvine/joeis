package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041375 Denominators of continued fraction convergents to <code>sqrt(202)</code>.
 * @author Sean A. Irvine
 */
public class A041375 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041375() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 6282, 0, 0, 0, 0, 0, 0}, new long[] {1, 4, 5, 14, 33, 47, 221, 6235, 25161, 31396, 87953, 207302, 295255, 1388322});
  }
}
