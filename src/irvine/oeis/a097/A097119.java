package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097119 Expansion of (1-x)^2/((1-x)^3-2x^4).
 * @author Sean A. Irvine
 */
public class A097119 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097119() {
    super(new long[] {2, 1, -3, 3}, new long[] {1, 1, 1, 1});
  }
}
