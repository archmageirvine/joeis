package irvine.oeis.a048;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A048503 G.f.: (1 - 4*x + 6*x^2 - 2*x^3)/((1-x)^3*(1-2*x)^2).
 * @author Sean A. Irvine
 */
public class A048503 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048503() {
    super(new long[] {4, -16, 25, -19, 7}, new long[] {1, 3, 8, 22, 61});
  }
}
