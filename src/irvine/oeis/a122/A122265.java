package irvine.oeis.a122;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A122265 10th-order Fibonacci numbers: a(n+1) = a(n)+...+a(n-9) with a(0) = ... = a(8) = 0, a(9) = 1.
 * @author Sean A. Irvine
 */
public class A122265 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122265() {
    super(new long[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, new long[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 1});
  }
}
