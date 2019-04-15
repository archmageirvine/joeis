package irvine.oeis.a293;

import irvine.oeis.LinearRecurrence;

/**
 * A293552 <code>a(n)</code> is the least integer k such that <code>k/Fibonacci(n) &gt; 1/4</code>.
 * @author Sean A. Irvine
 */
public class A293552 extends LinearRecurrence {

  /** Construct the sequence. */
  public A293552() {
    super(new long[] {-1, -1, 1, 0, 0, 0, 1, 1}, new long[] {0, 1, 1, 1, 1, 2, 2, 4});
  }
}
