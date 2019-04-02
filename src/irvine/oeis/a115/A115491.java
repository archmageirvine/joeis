package irvine.oeis.a115;

import irvine.oeis.LinearRecurrence;

/**
 * A115491 Number of monic irreducible polynomials of degree 5 in GF(2^n)[x].
 * @author Sean A. Irvine
 */
public class A115491 extends LinearRecurrence {

  /** Construct the sequence. */
  public A115491() {
    super(new long[] {-64, 34}, new long[] {6, 204});
  }
}
