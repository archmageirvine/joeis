package irvine.oeis.a110;

import irvine.oeis.LinearRecurrence;

/**
 * A110224 <code>a(n) =</code> Fibonacci(n)^3 + Fibonacci(n+1)^3.
 * @author Sean A. Irvine
 */
public class A110224 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110224() {
    super(new long[] {-1, -3, 6, 3}, new long[] {1, 2, 9, 35});
  }
}
