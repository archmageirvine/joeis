package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157729 a(n) = Fibonacci(n) + 5.
 * @author Sean A. Irvine
 */
public class A157729 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157729() {
    super(new long[] {-1, 0, 2}, new long[] {5, 6, 6});
  }
}
