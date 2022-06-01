package irvine.oeis.a117;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A117373 Expansion of (1 - 3x)/(1 - x + x^2).
 * @author Sean A. Irvine
 */
public class A117373 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117373() {
    super(new long[] {-1, 1}, new long[] {1, -2});
  }
}
