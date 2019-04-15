package irvine.oeis.a221;

import irvine.oeis.LinearRecurrence;

/**
 * A221719 <code>a(n) = 3*2^n - Fibonacci(n+3) - 1</code>.
 * @author Sean A. Irvine
 */
public class A221719 extends LinearRecurrence {

  /** Construct the sequence. */
  public A221719() {
    super(new long[] {2, -1, -4, 4}, new long[] {0, 2, 6, 15});
  }
}
