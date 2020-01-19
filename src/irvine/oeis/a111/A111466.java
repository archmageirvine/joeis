package irvine.oeis.a111;

import irvine.oeis.LinearRecurrence;

/**
 * A111466 <code>a(1) = 1, a(n+1) = a(n) - F(n+1)</code>, if <code>F(n+1) &lt;= a(n)</code>, else <code>a(n+1) = a(n) + F(n+1). F(n)</code> is the n-th Fibonacci number <code>(A000045)</code>.
 * @author Sean A. Irvine
 */
public class A111466 extends LinearRecurrence {

  /** Construct the sequence. */
  public A111466() {
    super(new long[] {1, 0, 0, 4, 0, 0}, new long[] {1, 0, 2, 5, 0, 8});
  }
}
