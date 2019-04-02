package irvine.oeis.a188;

import irvine.oeis.LinearRecurrence;

/**
 * A188048 Expansion of (1 - x^2)/(1 - 3*x^2 - x^3).
 * @author Sean A. Irvine
 */
public class A188048 extends LinearRecurrence {

  /** Construct the sequence. */
  public A188048() {
    super(new long[] {1, 3, 0}, new long[] {1, 0, 2});
  }
}
