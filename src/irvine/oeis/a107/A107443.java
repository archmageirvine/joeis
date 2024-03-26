package irvine.oeis.a107;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A107443 Expansion of g.f.: (1+3*x^2)/((1-x)*(1+x+2*x^2)*(1-x+2*x^2)).
 * @author Sean A. Irvine
 */
public class A107443 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107443() {
    super(new long[] {4, -4, 3, -3, 1}, new long[] {1, 1, 1, 1, -3});
  }
}
