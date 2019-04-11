package irvine.oeis.a062;

import irvine.oeis.LinearRecurrence;

/**
 * A062114 <code>a(n) =</code> 2*Fibonacci(n) <code>- (1 - (-1)^n)/2</code>.
 * @author Sean A. Irvine
 */
public class A062114 extends LinearRecurrence {

  /** Construct the sequence. */
  public A062114() {
    super(new long[] {-1, -1, 2, 1}, new long[] {0, 1, 2, 3});
  }
}
