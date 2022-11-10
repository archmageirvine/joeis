package irvine.oeis.a147;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A147604 Expansion of g.f.: (1 + x^2 - x^3)/(1 - x - x^2 + x^3 - x^5).
 * @author Sean A. Irvine
 */
public class A147604 extends LinearRecurrence {

  /** Construct the sequence. */
  public A147604() {
    super(new long[] {1, 0, -1, 1, 1}, new long[] {1, 1, 3, 2, 4});
  }
}
