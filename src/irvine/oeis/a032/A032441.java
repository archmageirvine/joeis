package irvine.oeis.a032;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A032441 a(n) = Sum_{i=0..2} binomial(Fibonacci(n),i).
 * @author Sean A. Irvine
 */
public class A032441 extends LinearRecurrence {

  /** Construct the sequence. */
  public A032441() {
    super(new long[] {-1, 2, 4, -6, -2, 4}, new long[] {1, 2, 2, 4, 7, 16});
  }
}
