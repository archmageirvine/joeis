package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052967 Expansion of (1 - x)/(1 - 2*x - x^2 + x^4).
 * @author Sean A. Irvine
 */
public class A052967 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052967() {
    super(new long[] {-1, 0, 1, 2}, new long[] {1, 1, 3, 7});
  }
}
