package irvine.oeis.a087;

import irvine.oeis.LinearRecurrence;

/**
 * A087453 <code>a(n) = S(n,5)</code>, where <code>S(n,m) = Sum_{k=0..n} binomial(n,k)*Fibonacci(m*k)</code>.
 * @author Sean A. Irvine
 */
public class A087453 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087453() {
    super(new long[] {-11, 13}, new long[] {0, 5});
  }
}
