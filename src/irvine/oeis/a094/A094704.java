package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094704 Convolution of Fibonacci(n) and 10^n.
 * @author Sean A. Irvine
 */
public class A094704 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094704() {
    super(new long[] {-10, -9, 11}, new long[] {0, 1, 11});
  }
}
