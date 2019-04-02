package irvine.oeis.a049;

import irvine.oeis.LinearRecurrence;

/**
 * A049670 a(n) = Fibonacci(10*n)/55.
 * @author Sean A. Irvine
 */
public class A049670 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049670() {
    super(new long[] {-1, 123}, new long[] {0, 1});
  }
}
