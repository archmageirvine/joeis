package irvine.oeis.a081;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A081079 a(n) = Lucas(4*n+2) - 3 = 5*Fibonacci(2*n)*Fibonacci(2*n+2).
 * @author Sean A. Irvine
 */
public class A081079 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081079() {
    super(new long[] {1, -8, 8}, new long[] {0, 15, 120});
  }
}
