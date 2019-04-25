package irvine.oeis.a225;

import irvine.oeis.LinearRecurrence;

/**
 * A225799 <code>Sum_{k=0..n} binomial(n,k) * 10^(n-k) * Fibonacci(n+k)</code>.
 * @author Sean A. Irvine
 */
public class A225799 extends LinearRecurrence {

  /** Construct the sequence. */
  public A225799() {
    super(new long[] {109, 13}, new long[] {0, 11});
  }
}
