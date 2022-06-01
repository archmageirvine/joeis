package irvine.oeis.a115;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A115490 Number of monic irreducible polynomials of degree 4 in GF(2^n)[x].
 * @author Sean A. Irvine
 */
public class A115490 extends LinearRecurrence {

  /** Construct the sequence. */
  public A115490() {
    super(new long[] {-64, 20}, new long[] {3, 60});
  }
}
