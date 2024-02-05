package irvine.oeis.a129;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A129361 a(n) = Sum_{k=floor((n+1)/2)..n} Fibonacci(k+1).
 * @author Sean A. Irvine
 */
public class A129361 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129361() {
    super(new long[] {-1, -1, 0, -1, 2, 1}, new long[] {1, 1, 3, 5, 10, 16});
  }
}
