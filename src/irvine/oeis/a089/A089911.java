package irvine.oeis.a089;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A089911 a(n) = Fibonacci(n) mod 12.
 * @author Sean A. Irvine
 */
public class A089911 extends LinearRecurrence {

  /** Construct the sequence. */
  public A089911() {
    super(new long[] {1, -1, 0, 1, -1, 0, 1, -1, 0, 1, -1, 0, 1, -1, 0, 1, -1, 0, 1, -1, 0, 1}, new long[] {0, 1, 1, 2, 3, 5, 8, 1, 9, 10, 7, 5, 0, 5, 5, 10, 3, 1, 4, 5, 9, 2});
  }
}
