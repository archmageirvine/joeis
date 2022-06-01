package irvine.oeis.a134;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A134490 a(n) = Fibonacci(5n + 3).
 * @author Sean A. Irvine
 */
public class A134490 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134490() {
    super(new long[] {1, 11}, new long[] {2, 21});
  }
}
