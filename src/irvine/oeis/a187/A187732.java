package irvine.oeis.a187;

import irvine.oeis.LinearRecurrence;

/**
 * A187732 Expansion of <code>x/(x^4 - 13x^3 + 36x^2 - 13x + 1)</code>.
 * @author Sean A. Irvine
 */
public class A187732 extends LinearRecurrence {

  /** Construct the sequence. */
  public A187732() {
    super(new long[] {-1, 13, -36, 13}, new long[] {0, 1, 13, 133});
  }
}
