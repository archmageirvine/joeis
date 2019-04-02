package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024014 2^n-n^4.
 * @author Sean A. Irvine
 */
public class A024014 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024014() {
    super(new long[] {-2, 11, -25, 30, -20, 7}, new long[] {1, 1, -12, -73, -240, -593});
  }
}
