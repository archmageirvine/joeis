package irvine.oeis.a269;
// manually 2021-05-29 (1 more term)

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A269889 The number of permutations of 1, 2,..., n such that none of 123, 132, 213, 231, 312, 321 appear in the permutation.
 * @author Georg Fischer
 */
public class A269889 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A269889() {
    super(0, "[[0],[-12, 4, 3,-1],[-4,-3, 1]]", "1, 1, 2, 0, 12", 0);
  }
}
