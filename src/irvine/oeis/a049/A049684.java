package irvine.oeis.a049;

import irvine.oeis.LinearRecurrence;

/**
 * A049684 <code>a(n) = Fibonacci(2n)^2</code>.
 * @author Sean A. Irvine
 */
public class A049684 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049684() {
    super(new long[] {1, -8, 8}, new long[] {0, 1, 9});
  }
}
