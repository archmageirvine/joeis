package irvine.oeis.a259;

import irvine.oeis.LinearRecurrence;

/**
 * A259546 a(n) = n^3*Fibonacci(n).
 * @author Sean A. Irvine
 */
public class A259546 extends LinearRecurrence {

  /** Construct the sequence. */
  public A259546() {
    super(new long[] {-1, -4, -2, 8, 5, -8, -2, 4}, new long[] {0, 1, 8, 54, 192, 625, 1728, 4459});
  }
}
