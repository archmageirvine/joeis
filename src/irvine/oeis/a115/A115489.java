package irvine.oeis.a115;

import irvine.oeis.LinearRecurrence;

/**
 * A115489 Number of monic irreducible polynomials of degree <code>3 in GF(2^n)[x]</code>.
 * @author Sean A. Irvine
 */
public class A115489 extends LinearRecurrence {

  /** Construct the sequence. */
  public A115489() {
    super(new long[] {-16, 10}, new long[] {2, 20});
  }
}
