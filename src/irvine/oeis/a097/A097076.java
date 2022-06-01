package irvine.oeis.a097;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A097076 Expansion of x/(1 - x - 3x^2 - x^3).
 * @author Sean A. Irvine
 */
public class A097076 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097076() {
    super(new long[] {1, 3, 1}, new long[] {0, 1, 1});
  }
}
