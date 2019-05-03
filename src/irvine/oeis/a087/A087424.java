package irvine.oeis.a087;

import irvine.oeis.LinearRecurrence;

/**
 * A087424 <code>a(n) = S(4*n,4)/S(n,4)</code> where <code>S(n,m) = Sum_{k=0..n} binomial(n,k)*Fibonacci(m*k)</code>.
 * @author Sean A. Irvine
 */
public class A087424 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087424() {
    super(new long[] {-531441, 413343, -40824, 567}, new long[] {567, 239841, 114082668, 55125843489L});
  }
}
