package irvine.oeis.a087;

import irvine.oeis.LinearRecurrence;

/**
 * A087584 <code>a(n)=(1/7)*sum(k=0,n,binomial(n,k)*Fibonacci(k)*7^k)</code>.
 * @author Sean A. Irvine
 */
public class A087584 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087584() {
    super(new long[] {41, 9}, new long[] {1, 9});
  }
}
