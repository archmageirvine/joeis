package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134503 <code>a(n) =</code> Fibonacci(7n <code>+ 5)</code>.
 * @author Sean A. Irvine
 */
public class A134503 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134503() {
    super(new long[] {1, 29}, new long[] {5, 144});
  }
}
