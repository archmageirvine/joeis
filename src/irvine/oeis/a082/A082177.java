package irvine.oeis.a082;

import irvine.oeis.LinearRecurrence;

/**
 * A082177 Professor Umbugio's sequence <code>A082176</code> divided by 1946.
 * @author Sean A. Irvine
 */
public class A082177 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082177() {
    super(new long[] {-10533473613720L, 23585007306L, -19690571, 7266}, new long[] {0, 0, 106, 577647});
  }
}
