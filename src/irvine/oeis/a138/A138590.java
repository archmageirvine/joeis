package irvine.oeis.a138;

import irvine.oeis.LinearRecurrence;

/**
 * A138590 <code>a(n) =</code> Fibonacci(9*n).
 * @author Sean A. Irvine
 */
public class A138590 extends LinearRecurrence {

  /** Construct the sequence. */
  public A138590() {
    super(new long[] {1, 76}, new long[] {0, 34});
  }
}
