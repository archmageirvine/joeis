package irvine.oeis.a287;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A287700 a(n) = (4!)^3 * [z^4] hypergeom([], [1,1], z)^n.
 * @author Sean A. Irvine
 */
public class A287700 extends LinearRecurrence {

  /** Construct the sequence. */
  public A287700() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 1, 346, 6219, 36628});
  }
}
