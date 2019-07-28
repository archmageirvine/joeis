package irvine.oeis.a065;

import irvine.oeis.LinearRecurrence;

/**
 * A065220 <code>a(n) = Fibonacci(n) - n</code>.
 * @author Sean A. Irvine
 */
public class A065220 extends LinearRecurrence {

  /** Construct the sequence. */
  public A065220() {
    super(new long[] {1, -1, -2, 3}, new long[] {0, 0, -1, -1});
  }
}
