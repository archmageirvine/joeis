package irvine.oeis.a097;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A097124 Expansion of (1-x)^2/((1-x)^3-5x^3).
 * @author Sean A. Irvine
 */
public class A097124 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097124() {
    super(new long[] {6, -3, 3}, new long[] {1, 1, 1});
  }
}
