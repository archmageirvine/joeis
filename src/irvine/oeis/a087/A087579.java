package irvine.oeis.a087;

import irvine.oeis.LinearRecurrence;

/**
 * A087579 <code>a(n)=(1/6)*sum(k=0,n,binomial(n,k)*Fibonacci(k)*6^k)</code>.
 * @author Sean A. Irvine
 */
public class A087579 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087579() {
    super(new long[] {29, 8}, new long[] {1, 8});
  }
}
