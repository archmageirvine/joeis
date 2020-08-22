package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090280 "Plain Bob Minimus" in bell-ringing is a sequence of permutations p_1=(1,2,3,4), p_2=(2,1,4,3), .. which runs through all permutations of {1,2,3,4} with period 24; sequence gives number in position 4 of n-th permutation.
 * @author Sean A. Irvine
 */
public class A090280 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090280() {
    super(new long[] {1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1}, new long[] {4, 3, 3, 1, 1, 2, 2, 4, 2, 4, 4, 1, 1, 3, 3, 2, 3, 2, 2, 1, 1, 4, 4});
  }
}
