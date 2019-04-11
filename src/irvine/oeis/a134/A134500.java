package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134500 <code>a(n) =</code> Fibonacci(7n <code>+ 2)</code>.
 * @author Sean A. Irvine
 */
public class A134500 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134500() {
    super(new long[] {1, 29}, new long[] {1, 34});
  }
}
