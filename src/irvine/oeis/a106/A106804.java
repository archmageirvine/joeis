package irvine.oeis.a106;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A106804 Expansion of g.f.: x*(2 - 9*x - 4*x^2)/((1 - 5*x + x^2)*(1 - 5*x - x^2)).
 * @author Sean A. Irvine
 */
public class A106804 extends LinearRecurrence {

  /** Construct the sequence. */
  public A106804() {
    super(new long[] {1, 0, -25, 10}, new long[] {0, 2, 11, 56});
  }
}
