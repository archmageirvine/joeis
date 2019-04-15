package irvine.oeis.a032;

import irvine.oeis.LinearRecurrence;

/**
 * A032441 <code>a(n) =</code> Sum_{i=0..2} <code>binomial(Fibonacci(n)</code>,i).
 * @author Sean A. Irvine
 */
public class A032441 extends LinearRecurrence {

  /** Construct the sequence. */
  public A032441() {
    super(new long[] {-1, 2, 4, -6, -2, 4}, new long[] {1, 2, 2, 4, 7, 16});
  }
}
