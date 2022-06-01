package irvine.oeis.a094;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A094687 Convolution of Fibonacci and Jacobsthal numbers.
 * @author Sean A. Irvine
 */
public class A094687 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094687() {
    super(new long[] {-2, -3, 2, 2}, new long[] {0, 0, 1, 2});
  }
}
