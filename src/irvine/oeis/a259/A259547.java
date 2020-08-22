package irvine.oeis.a259;

import irvine.oeis.LinearRecurrence;

/**
 * A259547 a(n) = n^4*Fibonacci(n).
 * @author Sean A. Irvine
 */
public class A259547 extends LinearRecurrence {

  /** Construct the sequence. */
  public A259547() {
    super(new long[] {1, 5, 5, -10, -15, 11, 15, -10, -5, 5}, new long[] {0, 1, 16, 162, 768, 3125, 10368, 31213, 86016, 223074});
  }
}
