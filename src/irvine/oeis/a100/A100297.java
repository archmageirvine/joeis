package irvine.oeis.a100;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A100297 Expansion of g.f.: x*(1-11*x+x^2)/(1-17*x+14*x^2-x^3).
 * @author Sean A. Irvine
 */
public class A100297 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100297() {
    super(1, new long[] {1, -14, 17}, new long[] {1, 6, 89});
  }
}
