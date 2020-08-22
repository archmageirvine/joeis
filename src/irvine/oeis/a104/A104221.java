package irvine.oeis.a104;

import irvine.oeis.LinearRecurrence;

/**
 * A104221 a(n) = Fibonacci(n) - (Fibonacci(n) mod 2).
 * @author Sean A. Irvine
 */
public class A104221 extends LinearRecurrence {

  /** Construct the sequence. */
  public A104221() {
    super(new long[] {-1, -1, 1, 1, 1}, new long[] {0, 0, 0, 2, 2});
  }
}
