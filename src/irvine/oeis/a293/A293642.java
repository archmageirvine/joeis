package irvine.oeis.a293;

import irvine.oeis.LinearRecurrence;

/**
 * A293642 <code>a(n)</code> is the greatest integer k such that k/Fibonacci(n) <code>&lt; 3/5</code>.
 * @author Sean A. Irvine
 */
public class A293642 extends LinearRecurrence {

  /** Construct the sequence. */
  public A293642() {
    super(new long[] {-1, -1, 2, 1, -2, 0, 3, -1, -3, 1, 2, -2, -1, 2, 1}, new long[] {0, 0, 0, 1, 1, 3, 4, 7, 12, 20, 33, 53, 86, 139, 226});
  }
}
