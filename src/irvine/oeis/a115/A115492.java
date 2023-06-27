package irvine.oeis.a115;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A115492 Number of monic irreducible polynomials of degree 2 in GF(2^n)[x,y].
 * @author Sean A. Irvine
 */
public class A115492 extends LinearRecurrence {

  /** Construct the sequence. */
  public A115492() {
    super(1, new long[] {-4096, 3456, -808, 54}, new long[] {35, 1134, 34748, 1081080});
  }
}
