package irvine.oeis.a287;

import irvine.oeis.LinearRecurrence;

/**
 * A287700 <code>a(n) = (4!)^3 *</code> [z^4] hypergeom([], <code>[1,1],</code> z)^n.
 * @author Sean A. Irvine
 */
public class A287700 extends LinearRecurrence {

  /** Construct the sequence. */
  public A287700() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 1, 346, 6219, 36628});
  }
}
