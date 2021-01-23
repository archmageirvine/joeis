package irvine.oeis.a178;

import irvine.oeis.LinearRecurrence;

/**
 * A178778 Partial sums of walks of length n+1 on a tetrahedron A001998.
 * @author Sean A. Irvine
 */
public class A178778 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178778() {
    super(new long[] {-9, 21, -12, -4, 5}, new long[] {1, 3, 7, 17, 42});
  }
}
