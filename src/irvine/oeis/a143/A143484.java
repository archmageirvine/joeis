package irvine.oeis.a143;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A143484 "Fourth down, Extream [sic] between the two farthest Bells from it" in bell-ringing is a sequence of permutations p_1=(1,2,3,4), p_2=(1,2,4,3), .. which runs through all permutations of {1,2,3,4} with period 24; sequence gives number in position 1 of n-th permutation.
 * @author Sean A. Irvine
 */
public class A143484 extends LinearRecurrence {

  /** Construct the sequence. */
  public A143484() {
    super(new long[] {1, -2, 2, -1, 0, 0, 1, -2, 2, -1, 0, 0, 1, -2, 2, -1, 0, 0, 1, -2, 2}, new long[] {1, 1, 1, 4, 4, 1, 1, 1, 3, 3, 3, 4, 4, 3, 3, 3, 2, 2, 2, 4, 4});
  }
}
