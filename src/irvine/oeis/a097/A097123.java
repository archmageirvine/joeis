package irvine.oeis.a097;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A097123 Expansion of (1-x)^2/((1-x)^3 - 4*x^3).
 * @author Sean A. Irvine
 */
public class A097123 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097123() {
    super(new long[] {5, -3, 3}, new long[] {1, 1, 1});
  }
}
