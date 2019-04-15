package irvine.oeis.a087;

import irvine.oeis.LinearRecurrence;

/**
 * A087603 <code>a(n) =</code> (1/8)*Sum_{k=0..n} <code>binomial(n,k)*Fibonacci(k)*8^k</code>.
 * @author Sean A. Irvine
 */
public class A087603 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087603() {
    super(new long[] {55, 10}, new long[] {1, 10});
  }
}
