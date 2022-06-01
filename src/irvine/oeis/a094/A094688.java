package irvine.oeis.a094;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A094688 Convolution of Fibonacci(n) and 3^n.
 * @author Sean A. Irvine
 */
public class A094688 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094688() {
    super(new long[] {-3, -2, 4}, new long[] {0, 1, 4});
  }
}
