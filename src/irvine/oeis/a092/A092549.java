package irvine.oeis.a092;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A092549 Molien series for symmetrized weight enumerators of self-dual codes over GF(4) + GF(4)u with u^2 = 0.
 * @author Sean A. Irvine
 */
public class A092549 extends LinearRecurrence {

  /** Construct the sequence. */
  public A092549() {
    super(new long[] {-1, 2, 0, -2, 3, -4, 1, 2, -3, 4, -3, 2, 1, -4, 3, -2, 0, 2}, new long[] {1, 1, 3, 3, 8, 9, 18, 20, 37, 42, 69, 78, 122, 139, 204, 231, 327, 371});
  }
}
