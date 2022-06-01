package irvine.oeis.a134;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A134499 a(n) = Fibonacci(7*n+1).
 * @author Sean A. Irvine
 */
public class A134499 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134499() {
    super(new long[] {1, 29}, new long[] {1, 21});
  }
}
