package irvine.oeis.a104;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A104220 a(n) = 1 + Fibonacci(n) - (Fibonacci(n) mod 2).
 * @author Sean A. Irvine
 */
public class A104220 extends LinearRecurrence {

  /** Construct the sequence. */
  public A104220() {
    super(new long[] {-1, -1, 1, 1, 1}, new long[] {1, 1, 1, 3, 3});
  }
}
