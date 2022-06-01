package irvine.oeis.a092;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A092806 Expansion of (1 + 8x - 9x^2)/(1 - 3x + 3x^2 - 1001x^3).
 * @author Sean A. Irvine
 */
public class A092806 extends LinearRecurrence {

  /** Construct the sequence. */
  public A092806() {
    super(new long[] {1001, -3, 3}, new long[] {1, 11, 21});
  }
}
