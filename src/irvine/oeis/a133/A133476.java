package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133476 a(n) = Sum_{k&gt;=0} binomial(n,5*k+1).
 * @author Sean A. Irvine
 */
public class A133476 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133476() {
    super(new long[] {2, -5, 10, -10, 5}, new long[] {0, 1, 2, 3, 4});
  }
}
