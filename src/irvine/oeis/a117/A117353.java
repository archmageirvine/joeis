package irvine.oeis.a117;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A117353 Expansion of (1-x)/(1-3x+x^2+4x^3-4x^4).
 * @author Sean A. Irvine
 */
public class A117353 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117353() {
    super(new long[] {4, -4, -1, 3}, new long[] {1, 2, 5, 9});
  }
}
