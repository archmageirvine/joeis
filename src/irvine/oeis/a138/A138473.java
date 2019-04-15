package irvine.oeis.a138;

import irvine.oeis.LinearRecurrence;

/**
 * A138473 <code>a(n) = Fibonacci(8*n)</code>.
 * @author Sean A. Irvine
 */
public class A138473 extends LinearRecurrence {

  /** Construct the sequence. */
  public A138473() {
    super(new long[] {-1, 47}, new long[] {0, 21});
  }
}
