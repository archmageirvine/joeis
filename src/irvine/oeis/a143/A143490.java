package irvine.oeis.a143;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A143490 "Fourth down, Extream [sic] between the two farthest Bells from it" in bell-ringing is a sequence of permutations p_1=(1,2,3,4), p_2=(1,2,4,3), .. which runs through all permutations of {1,2,3,4} with period 24; sequence gives position of bell 3 in n-th permutation.
 * @author Sean A. Irvine
 */
public class A143490 extends LinearRecurrence {

  /** Construct the sequence. */
  public A143490() {
    super(1, new long[] {1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {3, 4, 4, 4, 3, 3, 2, 2, 1, 1, 1, 2, 2});
  }
}
