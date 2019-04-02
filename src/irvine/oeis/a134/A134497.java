package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134497 a(n) = Fibonacci(6n+5).
 * @author Sean A. Irvine
 */
public class A134497 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134497() {
    super(new long[] {-1, 18}, new long[] {5, 89});
  }
}
