package irvine.oeis.a101;

import irvine.oeis.LinearRecurrence;

/**
 * A101351 <code>a(n) = 2^n-1 + Fibonacci(n)</code>.
 * @author Sean A. Irvine
 */
public class A101351 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101351() {
    super(new long[] {2, -1, -4, 4}, new long[] {2, 4, 9, 18});
  }
}
