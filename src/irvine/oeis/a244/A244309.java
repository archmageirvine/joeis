package irvine.oeis.a244;

import irvine.oeis.LinearRecurrence;

/**
 * A244309 <code>a(n) = F(n)^3 - F(n)^2</code>, where <code>F(n)</code> is the n-th Fibonacci number <code>(A000045)</code>.
 * @author Sean A. Irvine
 */
public class A244309 extends LinearRecurrence {

  /** Construct the sequence. */
  public A244309() {
    super(new long[] {-1, -1, 14, -4, -22, 2, 5}, new long[] {0, 0, 0, 4, 18, 100, 448});
  }
}
