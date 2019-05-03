package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051170 <code>T(n,5)</code>, array T as in <code>A051168</code>; a count of Lyndon words; aperiodic necklaces with 5 black beads and <code>n-5</code> white beads.
 * @author Sean A. Irvine
 */
public class A051170 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051170() {
    super(new long[] {1, -4, 6, -4, 1, -1, 4, -6, 4}, new long[] {0, 1, 3, 7, 14, 25, 42, 66, 99});
  }
}
