package irvine.oeis.a247;

import irvine.oeis.LinearRecurrence;

/**
 * A247610 <code>a(n) = Sum_{k=0..5} binomial(10,k)*binomial(n,k)</code>.
 * @author Sean A. Irvine
 */
public class A247610 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247610() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 11, 66, 286, 1001, 3003});
  }
}
