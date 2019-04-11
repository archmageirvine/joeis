package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134493 <code>a(n) =</code> Fibonacci(6*n+1).
 * @author Sean A. Irvine
 */
public class A134493 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134493() {
    super(new long[] {-1, 18}, new long[] {1, 13});
  }
}
