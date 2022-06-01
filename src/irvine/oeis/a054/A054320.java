package irvine.oeis.a054;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A054320 Expansion of g.f.: (1 + x)/(1 - 10*x + x^2).
 * @author Sean A. Irvine
 */
public class A054320 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054320() {
    super(new long[] {-1, 10}, new long[] {1, 11});
  }
}
