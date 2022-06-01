package irvine.oeis.a134;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A134501 a(n) = Fibonacci(7n + 3).
 * @author Sean A. Irvine
 */
public class A134501 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134501() {
    super(new long[] {1, 29}, new long[] {2, 55});
  }
}
