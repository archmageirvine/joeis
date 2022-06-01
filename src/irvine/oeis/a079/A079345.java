package irvine.oeis.a079;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A079345 Fibonacci(n) mod 16.
 * @author Sean A. Irvine
 */
public class A079345 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079345() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {0, 1, 1, 2, 3, 5, 8, 13, 5, 2, 7, 9, 0, 9, 9, 2, 11, 13, 8, 5, 13, 2, 15, 1});
  }
}
