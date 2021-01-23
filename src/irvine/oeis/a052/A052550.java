package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052550 Expansion of (1-2*x)/(1 - 3*x - x^2 + 2*x^3).
 * @author Sean A. Irvine
 */
public class A052550 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052550() {
    super(new long[] {-2, 1, 3}, new long[] {1, 1, 4});
  }
}
