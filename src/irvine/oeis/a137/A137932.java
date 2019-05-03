package irvine.oeis.a137;

import irvine.oeis.LinearRecurrence;

/**
 * A137932 Terms in an <code>n X n</code> spiral that do not lie on its principal diagonals.
 * @author Sean A. Irvine
 */
public class A137932 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137932() {
    super(new long[] {1, -2, 0, 2}, new long[] {0, 0, 0, 4});
  }
}
