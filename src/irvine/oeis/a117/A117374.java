package irvine.oeis.a117;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A117374 Expansion of (1-3x)/(1-x^2+x^3).
 * @author Sean A. Irvine
 */
public class A117374 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117374() {
    super(new long[] {-1, 1, 0}, new long[] {1, -3, 1});
  }
}
