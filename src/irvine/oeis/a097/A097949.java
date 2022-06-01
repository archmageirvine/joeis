package irvine.oeis.a097;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A097949 G.f.: -(2+7*x-x^3)/(1+4*x-4*x^3-x^4).
 * @author Sean A. Irvine
 */
public class A097949 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097949() {
    super(new long[] {1, 4, 0, -4}, new long[] {-2, 1, -4, 9});
  }
}
