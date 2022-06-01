package irvine.oeis.a128;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A128445 Number of facets of the Alternating Sign Matrix polytope ASM(n).
 * @author Sean A. Irvine
 */
public class A128445 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128445() {
    super(new long[] {1, -3, 3}, new long[] {20, 8, 4});
  }
}
