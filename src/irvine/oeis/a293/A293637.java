package irvine.oeis.a293;

import irvine.oeis.LinearRecurrence;

/**
 * A293637 <code>a(n)</code> is the least integer k such that k/Fibonacci(n) <code>&gt; 1/5</code>.
 * @author Sean A. Irvine
 */
public class A293637 extends LinearRecurrence {

  /** Construct the sequence. */
  public A293637() {
    super(new long[] {-1, -1, 2, 1, -2, 0, 3, -1, -3, 1, 2, -2, -1, 2, 1}, new long[] {0, 1, 1, 1, 1, 1, 2, 3, 5, 7, 11, 18, 29, 47, 76});
  }
}
