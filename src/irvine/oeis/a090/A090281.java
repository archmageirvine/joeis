package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090281 "Plain Bob Minimus" in bell-ringing is a sequence of permutations p_1=(1,2,3,4), p_2=(2,1,4,3), ... which runs through all permutations of {1,2,3,4} with period 24; sequence gives position of bell 1 (the treble bell) in n-th permutation.
 * @author Sean A. Irvine
 */
public class A090281 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090281() {
    super(new long[] {1, -1, 0, 0, 1}, new long[] {1, 2, 3, 4, 4});
  }
}
