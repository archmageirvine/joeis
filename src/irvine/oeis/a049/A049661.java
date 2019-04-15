package irvine.oeis.a049;

import irvine.oeis.LinearRecurrence;

/**
 * A049661 <code>a(n) = (Fibonacci(6*n+1) - 1)/4</code>.
 * @author Sean A. Irvine
 */
public class A049661 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049661() {
    super(new long[] {1, -19, 19}, new long[] {0, 3, 58});
  }
}
