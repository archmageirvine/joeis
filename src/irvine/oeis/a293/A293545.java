package irvine.oeis.a293;

import irvine.oeis.LinearRecurrence;

/**
 * A293545 <code>a(n)</code> is the greatest integer k such that k/Fibonacci(n) <code>&lt; 2/3</code>.
 * @author Sean A. Irvine
 */
public class A293545 extends LinearRecurrence {

  /** Construct the sequence. */
  public A293545() {
    super(new long[] {-1, -1, 1, 0, 0, 0, 0, 0, 1, 1}, new long[] {0, 0, 0, 1, 2, 3, 5, 8, 14, 22});
  }
}
