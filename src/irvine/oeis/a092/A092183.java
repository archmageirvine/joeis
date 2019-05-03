package irvine.oeis.a092;

import irvine.oeis.LinearRecurrence;

/**
 * A092183 Figurate numbers based on the <code>120-cell (4-D</code> polytope with Schlaefli symbol <code>{5,3,3})</code>.
 * @author Sean A. Irvine
 */
public class A092183 extends LinearRecurrence {

  /** Construct the sequence. */
  public A092183() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 600, 4983, 19468, 53505});
  }
}
