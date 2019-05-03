package irvine.oeis.a115;

import irvine.oeis.LinearRecurrence;

/**
 * A115490 Number of monic irreducible polynomials of degree 4 in <code>GF(2^n)[x]</code>.
 * @author Sean A. Irvine
 */
public class A115490 extends LinearRecurrence {

  /** Construct the sequence. */
  public A115490() {
    super(new long[] {-64, 20}, new long[] {3, 60});
  }
}
