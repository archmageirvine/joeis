package irvine.oeis.a030;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A030653 n^3*a(n) is the number of circles in complex projective plane tangent to three smooth curves of degree n in general position.
 * @author Sean A. Irvine
 */
public class A030653 extends LinearRecurrence {

  /** Construct the sequence. */
  public A030653() {
    super(new long[] {-1, 4, -6, 4}, new long[] {4, 23, 60, 121});
  }
}
