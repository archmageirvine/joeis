package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122265 10th-order Fibonacci numbers: <code>a(n+1) = a(n)+</code>...+a(n-9) with <code>a(0) = </code>... <code>= a(8) = 0, a(9) = 1</code>.
 * @author Sean A. Irvine
 */
public class A122265 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122265() {
    super(new long[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, new long[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 1});
  }
}
