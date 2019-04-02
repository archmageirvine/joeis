package irvine.oeis.a088;

import irvine.oeis.LinearRecurrence;

/**
 * A088014 Expansion of e.g.f.: cosh(sqrt(2)*x)*(1+exp(x)).
 * @author Sean A. Irvine
 */
public class A088014 extends LinearRecurrence {

  /** Construct the sequence. */
  public A088014() {
    super(new long[] {-2, -4, 3, 2}, new long[] {2, 1, 5, 7});
  }
}
