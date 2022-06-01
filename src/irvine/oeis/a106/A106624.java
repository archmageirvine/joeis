package irvine.oeis.a106;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A106624 Expansion of g.f.: (1 - x^2 + x^3)/((1-x^2)*(1-2*x^2)).
 * @author Sean A. Irvine
 */
public class A106624 extends LinearRecurrence {

  /** Construct the sequence. */
  public A106624() {
    super(new long[] {-2, 0, 3, 0}, new long[] {1, 0, 2, 1});
  }
}
