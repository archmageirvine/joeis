package irvine.oeis.a134;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A134491 a(n) = Fibonacci(5*n+4).
 * @author Sean A. Irvine
 */
public class A134491 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134491() {
    super(new long[] {1, 11}, new long[] {3, 34});
  }
}
