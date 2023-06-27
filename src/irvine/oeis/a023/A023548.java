package irvine.oeis.a023;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A023548 Convolution of natural numbers &gt;= 2 and Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A023548 extends LinearRecurrence {

  /** Construct the sequence. */
  public A023548() {
    super(1, new long[] {1, -1, -2, 3}, new long[] {2, 5, 11, 21});
  }
}
