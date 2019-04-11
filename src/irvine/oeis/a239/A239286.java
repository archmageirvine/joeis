package irvine.oeis.a239;

import irvine.oeis.LinearRecurrence;

/**
 * A239286 Expansion of <code>(x + 1)*(3*x^2 + 2*x + 1)/(x^2 + x + 1)^2</code>.
 * @author Sean A. Irvine
 */
public class A239286 extends LinearRecurrence {

  /** Construct the sequence. */
  public A239286() {
    super(new long[] {-1, -2, -3, -2}, new long[] {1, 1, 0, -2});
  }
}
