package irvine.oeis.a097;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A097038 A Jacobsthal variant.
 * @author Sean A. Irvine
 */
public class A097038 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097038() {
    super(new long[] {-4, -2, 4, 1}, new long[] {0, 1, 1, 5});
  }
}
