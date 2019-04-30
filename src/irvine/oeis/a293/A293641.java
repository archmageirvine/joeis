package irvine.oeis.a293;

import irvine.oeis.LinearRecurrence;

/**
 * A293641 <code>a(n)</code> is the integer k that minimizes <code>|k/Fibonacci(n) - 2/5|</code>.
 * @author Sean A. Irvine
 */
public class A293641 extends LinearRecurrence {

  /** Construct the sequence. */
  public A293641() {
    super(new long[] {1, 1, -2, -1, 2, 1, -2, -1, 2, 1}, new long[] {0, 0, 0, 1, 1, 2, 3, 5, 8, 14});
  }
}
