package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134495 <code>a(n) =</code> Fibonacci(6n <code>+ 3)</code>.
 * @author Sean A. Irvine
 */
public class A134495 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134495() {
    super(new long[] {-1, 18}, new long[] {2, 34});
  }
}
