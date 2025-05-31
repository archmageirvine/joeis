package irvine.oeis.a033;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A033888 a(n) = Fibonacci(4*n).
 * @author Sean A. Irvine
 */
public class A033888 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033888() {
    super(new long[] {-1, 7}, new long[] {0, 3});
  }
}
