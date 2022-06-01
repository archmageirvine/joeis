package irvine.oeis.a087;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A087453 a(n) = S(n,5), where S(n,m) = Sum_{k=0..n} binomial(n,k)*Fibonacci(m*k).
 * @author Sean A. Irvine
 */
public class A087453 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087453() {
    super(new long[] {-11, 13}, new long[] {0, 5});
  }
}
