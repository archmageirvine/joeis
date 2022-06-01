package irvine.oeis.a097;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A097118 Expansion of (1+x)/(1-x)^2-5x^3).
 * @author Sean A. Irvine
 */
public class A097118 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097118() {
    super(new long[] {5, -1, 2}, new long[] {1, 1, 1});
  }
}
