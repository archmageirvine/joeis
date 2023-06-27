package irvine.oeis.a210;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A210460 Expansion of x*(1+x)/(1-x-2*x^2-2*x^3-x^4).
 * @author Sean A. Irvine
 */
public class A210460 extends LinearRecurrence {

  /** Construct the sequence. */
  public A210460() {
    super(1, new long[] {1, 2, 2, 1}, new long[] {1, 2, 4, 10});
  }
}
