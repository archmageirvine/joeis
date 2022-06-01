package irvine.oeis.a082;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A082178 Professor Umbugio's sequence A082176 divided by 2*7*53*139 = 103138.
 * @author Sean A. Irvine
 */
public class A082178 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082178() {
    super(new long[] {-10533473613720L, 23585007306L, -19690571, 7266}, new long[] {0, 0, 2, 10899});
  }
}
