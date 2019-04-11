package irvine.oeis.a293;

import irvine.oeis.LinearRecurrence;

/**
 * A293546 <code>a(n)</code> is the least integer k such that k/Fibonacci(n) <code>&gt; 2/3</code>.
 * @author Sean A. Irvine
 */
public class A293546 extends LinearRecurrence {

  /** Construct the sequence. */
  public A293546() {
    super(new long[] {-1, -1, 1, 0, 0, 0, 0, 0, 1, 1}, new long[] {0, 1, 1, 2, 2, 4, 6, 9, 14, 23});
  }
}
