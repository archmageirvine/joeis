package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192727 a(n) = Fibonacci(n-2) + 2*a(n-2) - (n mod 2).
 * @author Sean A. Irvine
 */
public class A192727 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192727() {
    super(new long[] {2, 2, -5, -3, 4, 1}, new long[] {0, 0, 0, 0, 1, 1});
  }
}
