package irvine.oeis.a251;

import irvine.oeis.LinearRecurrence;

/**
 * A251732 a(n) = 3^n*A123335(n). Rational parts of the integers in Q(sqrt(2)) giving the length of a L\u00e9vy C-curve variant at iteration step n.
 * @author Sean A. Irvine
 */
public class A251732 extends LinearRecurrence {

  /** Construct the sequence. */
  public A251732() {
    super(new long[] {9, -6}, new long[] {1, -3});
  }
}
