package irvine.oeis.a032;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A032191 Number of necklaces with 6 black beads and n-6 white beads.
 * @author Sean A. Irvine
 */
public class A032191 extends LinearRecurrence {

  /** Construct the sequence. */
  public A032191() {
    super(6, new long[] {-1, 2, 1, -3, -1, 1, 4, -3, -3, 4, 1, -1, -3, 1, 2},
      new long[] {1, 1, 4, 10, 22, 42, 80, 132, 217, 335, 504, 728, 1038, 1428, 1944});
  }
}
