package irvine.oeis.a028;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A028040 Expansion of g.f. 1/((1-3*x)*(1-4*x)*(1-7*x)*(1-10*x)).
 * @author Sean A. Irvine
 */
public class A028040 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028040() {
    super(new long[] {-840, 694, -201, 24}, new long[] {1, 24, 375, 4870});
  }
}
