package irvine.oeis.a277;

import irvine.oeis.LinearRecurrence;

/**
 * A277723 a(n) = floor(n*tau^3) where tau is the tribonacci constant (A058265).
 * @author Sean A. Irvine
 */
public class A277723 extends LinearRecurrence {

  /** Construct the sequence. */
  public A277723() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {0, 6, 12, 18, 24, 31, 37, 43, 49, 56});
  }
}
