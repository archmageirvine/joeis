package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017105 a(n) = (8*n+3)^5.
 * @author Sean A. Irvine
 */
public class A017105 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017105() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {243, 161051, 2476099, 14348907, 52521875, 147008443});
  }
}
