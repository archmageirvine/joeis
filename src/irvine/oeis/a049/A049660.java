package irvine.oeis.a049;

import irvine.oeis.LinearRecurrence;

/**
 * A049660 <code>a(n) = Fibonacci(6*n)/8</code>.
 * @author Sean A. Irvine
 */
public class A049660 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049660() {
    super(new long[] {-1, 18}, new long[] {0, 1});
  }
}
