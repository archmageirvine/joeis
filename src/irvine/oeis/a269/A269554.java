package irvine.oeis.a269;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A269554 Expansion of (3*x^2 + 244*x + 1)/(x^3 - 99*x^2 + 99*x - 1).
 * @author Sean A. Irvine
 */
public class A269554 extends LinearRecurrence {

  /** Construct the sequence. */
  public A269554() {
    super(new long[] {1, -99, 99}, new long[] {-1, -343, -33861});
  }
}
