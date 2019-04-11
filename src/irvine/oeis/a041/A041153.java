package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041153 Denominators of continued fraction convergents to <code>sqrt(86)</code>.
 * @author Sean A. Irvine
 */
public class A041153 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041153() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 20810, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 3, 4, 7, 11, 95, 106, 201, 307, 1122, 20503, 62631, 83134, 145765, 228899, 1976957, 2205856, 4182813, 6388669, 23348820});
  }
}
