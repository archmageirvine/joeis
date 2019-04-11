package irvine.oeis.a293;

import irvine.oeis.LinearRecurrence;

/**
 * A293640 <code>a(n)</code> is the least integer k such that k/Fibonacci(n) <code>&gt; 2/5</code>.
 * @author Sean A. Irvine
 */
public class A293640 extends LinearRecurrence {

  /** Construct the sequence. */
  public A293640() {
    super(new long[] {-1, -1, 2, 1, -2, 0, 3, -1, -3, 1, 2, -2, -1, 2, 1}, new long[] {0, 1, 1, 1, 2, 2, 4, 6, 9, 14, 22, 36, 58, 94, 151});
  }
}
