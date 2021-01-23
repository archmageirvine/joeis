package irvine.oeis.a092;

import irvine.oeis.LinearRecurrence;

/**
 * A092183 Figurate numbers based on the 120-cell (4-D polytope with Schlaefli symbol {5,3,3}).
 * @author Sean A. Irvine
 */
public class A092183 extends LinearRecurrence {

  /** Construct the sequence. */
  public A092183() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 600, 4983, 19468, 53505});
  }
}
