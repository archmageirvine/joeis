package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074331 <code>a(n) =</code> Fibonacci(n+1) <code>- (1 + (-1)^n)/2</code>.
 * @author Sean A. Irvine
 */
public class A074331 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074331() {
    super(new long[] {-1, -1, 2, 1}, new long[] {0, 1, 1, 3});
  }
}
