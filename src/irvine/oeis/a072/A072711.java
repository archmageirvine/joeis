package irvine.oeis.a072;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A072711 Integers m such that the last digit of Fibonacci(m) is 9.
 * @author Sean A. Irvine
 */
public class A072711 extends LinearRecurrence {

  /** Construct the sequence. */
  public A072711() {
    super(1, new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 1}, new long[] {11, 29, 31, 32, 38, 49, 52, 58, 71});
  }
}
