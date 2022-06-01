package irvine.oeis.a214;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A214982 a(n) = (Fibonacci(5n)/Fibonacci(n) - 5)/50.
 * @author Sean A. Irvine
 */
public class A214982 extends LinearRecurrence {

  /** Construct the sequence. */
  public A214982() {
    super(new long[] {1, -5, -15, 15, 5}, new long[] {0, 1, 6, 45, 300});
  }
}
