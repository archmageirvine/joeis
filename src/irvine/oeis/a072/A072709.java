package irvine.oeis.a072;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A072709 Last digit of F(n) is 7 where F(n) is the n-th Fibonacci number.
 * @author Sean A. Irvine
 */
public class A072709 extends LinearRecurrence {

  /** Construct the sequence. */
  public A072709() {
    super(1, new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 1}, new long[] {14, 16, 17, 23, 34, 37, 43, 56, 74});
  }
}
