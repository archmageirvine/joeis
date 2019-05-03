package irvine.oeis.a092;

import irvine.oeis.LinearRecurrence;

/**
 * A092181 Figurate numbers based on the <code>24-cell (4-D</code> polytope with Schlaefli symbol <code>{3,4,3})</code>.
 * @author Sean A. Irvine
 */
public class A092181 extends LinearRecurrence {

  /** Construct the sequence. */
  public A092181() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 24, 153, 544, 1425});
  }
}
