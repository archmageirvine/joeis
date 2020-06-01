package irvine.oeis.a107;

import irvine.oeis.LinearRecurrence;

/**
 * A107358 Dying rabbits: <code>a(n) = Fibonacci(n)</code> for <code>n &lt;= 12;</code> for <code>n &gt;= 13, a(n) = a(n-1) + a(n-2) - a(n-13)</code>.
 * @author Sean A. Irvine
 */
public class A107358 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107358() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1}, new long[] {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144});
  }
}
