package irvine.oeis.a051;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A051170 T(n,5), array T as in A051168; a count of Lyndon words; aperiodic necklaces with 5 black beads and n-5 white beads.
 * @author Sean A. Irvine
 */
public class A051170 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051170() {
    super(new long[] {1, -4, 6, -4, 1, -1, 4, -6, 4}, new long[] {0, 1, 3, 7, 14, 25, 42, 66, 99});
  }
}
