package irvine.oeis.a072;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A072675 Integers m such that the last digit of Fibonacci(m) is 1.
 * @author Sean A. Irvine
 */
public class A072675 extends LinearRecurrence {

  /** Construct the sequence. */
  public A072675() {
    super(1, new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 1}, new long[] {1, 2, 8, 19, 22, 28, 41, 59, 61});
  }
}
