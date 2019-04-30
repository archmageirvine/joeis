package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090279 "Plain Bob Minimus" in bell-ringing is a sequence of permutations p_1=(1,2,3,4), p_2=(2,1,4,3), .. which runs through all permutations of <code>{1,2,3,4}</code> with period 24; sequence gives number in position 3 of n-th permutation.
 * @author Sean A. Irvine
 */
public class A090279 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090279() {
    super(new long[] {1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1}, new long[] {3, 4, 1, 3, 2, 1, 4, 2, 4, 2, 1, 4, 3, 1, 2, 3, 2, 3, 1, 2, 4, 1, 3});
  }
}
