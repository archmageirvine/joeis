package irvine.oeis.a160;

import irvine.oeis.LinearRecurrence;

/**
 * A160536 <code>a(n) = Fibonacci(n) + n^2</code>.
 * @author Sean A. Irvine
 */
public class A160536 extends LinearRecurrence {

  /** Construct the sequence. */
  public A160536() {
    super(new long[] {-1, 2, 1, -5, 4}, new long[] {0, 2, 5, 11, 19});
  }
}
