package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212323 <code>a(n) = 3^n - Fibonacci(n)</code>.
 * @author Sean A. Irvine
 */
public class A212323 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212323() {
    super(new long[] {-3, -2, 4}, new long[] {1, 2, 8});
  }
}
