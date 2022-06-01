package irvine.oeis.a052;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A052911 Expansion of (1-x)/(1 - 3*x - x^2 + 2*x^3).
 * @author Sean A. Irvine
 */
public class A052911 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052911() {
    super(new long[] {-2, 1, 3}, new long[] {1, 2, 7});
  }
}
