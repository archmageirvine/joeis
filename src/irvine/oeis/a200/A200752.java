package irvine.oeis.a200;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A200752 Expansion of (-x^2 + 3*x - 1)/(x^3 - x^2 + 3*x - 1).
 * @author Sean A. Irvine
 */
public class A200752 extends LinearRecurrence {

  /** Construct the sequence. */
  public A200752() {
    super(new long[] {1, -1, 3}, new long[] {1, 0, 0});
  }
}
