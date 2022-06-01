package irvine.oeis.a139;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A139714 a(n) = Sum_{k&gt;=0} binomial(n,5*k+2).
 * @author Sean A. Irvine
 */
public class A139714 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139714() {
    super(new long[] {2, -5, 10, -10, 5}, new long[] {0, 0, 1, 3, 6});
  }
}
