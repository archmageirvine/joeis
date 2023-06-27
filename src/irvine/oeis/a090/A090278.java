package irvine.oeis.a090;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A090278 "Plain Bob Minimus" in bell-ringing is a sequence of permutations p_1=(1,2,3,4), p_2=(2,1,4,3), .. which runs through all permutations of {1,2,3,4} with period 24; sequence gives number in position 2 of n-th permutation.
 * @author Sean A. Irvine
 */
public class A090278 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090278() {
    super(1, new long[] {1, -1, 0, 0, 0, 0, 1, -1, 0, 0, 0, 0, 1, -1, 0, 0, 0, 0, 1}, new long[] {2, 1, 4, 2, 3, 4, 1, 3, 3, 1, 2, 3, 4, 2, 1, 4, 4, 1, 3});
  }
}
