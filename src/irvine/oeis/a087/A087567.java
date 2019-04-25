package irvine.oeis.a087;

import irvine.oeis.LinearRecurrence;

/**
 * A087567 <code>a(n) = (1/5)*Sum_{k=0..n} binomial(n,k)*Fibonacci(k)*5^k</code>.
 * @author Sean A. Irvine
 */
public class A087567 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087567() {
    super(new long[] {19, 7}, new long[] {1, 7});
  }
}
