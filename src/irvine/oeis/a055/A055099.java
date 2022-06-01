package irvine.oeis.a055;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A055099 Expansion of g.f.: (1 + x)/(1 - 3*x - 2*x^2).
 * @author Sean A. Irvine
 */
public class A055099 extends LinearRecurrence {

  /** Construct the sequence. */
  public A055099() {
    super(new long[] {2, 3}, new long[] {1, 4});
  }
}
