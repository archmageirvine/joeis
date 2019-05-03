package irvine.oeis.a226;

import irvine.oeis.LinearRecurrence;

/**
 * A226205 <code>a(n) = F(n)^2 - F(n-1)^2</code> or <code>F(n+1) * F(n-2)</code> where <code>F(n) = A000045(n)</code>, the Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A226205 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226205() {
    super(new long[] {-1, 2, 2}, new long[] {1, 0, 3});
  }
}
