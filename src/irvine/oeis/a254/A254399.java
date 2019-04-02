package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254399 A Fibonacci sum: a(n) = Sum_{j=0..n-1} F(j)^2*F(2*n-j), in which the F's are the Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A254399 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254399() {
    super(new long[] {-1, 0, 14, -18, -4, 6}, new long[] {0, 2, 8, 41, 179, 794});
  }
}
