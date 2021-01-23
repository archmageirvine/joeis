package irvine.oeis.a023;

import irvine.oeis.LinearRecurrence;

/**
 * A023610 Convolution of Fibonacci numbers and {F(2), F(3), F(4), ...}.
 * @author Sean A. Irvine
 */
public class A023610 extends LinearRecurrence {

  /** Construct the sequence. */
  public A023610() {
    super(new long[] {-1, -2, 1, 2}, new long[] {1, 3, 7, 15});
  }
}
