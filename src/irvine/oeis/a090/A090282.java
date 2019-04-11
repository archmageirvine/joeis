package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090282 "Plain Bob Minimus" in bell-ringing is a sequence of permutations p_1=(1,2,3,4), p_2=(2,1,4,3), .. which runs through all permutations of <code>{1,2,3,4}</code> with period 24; sequence gives position of bell 2 in n-th permutation.
 * @author Sean A. Irvine
 */
public class A090282 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090282() {
    super(new long[] {1, -1, 0, 0, 1, -1, 0, 0, 1, -1, 0, 0, 1, -1, 0, 0, 1, -1, 0, 0, 1}, new long[] {2, 1, 1, 2, 3, 4, 4, 3, 4, 3, 2, 1, 1, 2, 3, 4, 3, 4, 4, 3, 2});
  }
}
