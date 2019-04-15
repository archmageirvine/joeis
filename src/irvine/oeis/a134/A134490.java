package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134490 <code>a(n) = Fibonacci(5n + 3)</code>.
 * @author Sean A. Irvine
 */
public class A134490 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134490() {
    super(new long[] {1, 11}, new long[] {2, 21});
  }
}
