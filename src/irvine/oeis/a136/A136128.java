package irvine.oeis.a136;
// Generated by gen_seq4.pl dfinite/holos at 2022-07-30 21:33

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A136128 Number of components in all permutations of [1,2,...,n].
 * @author Georg Fischer
 */
public class A136128 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A136128() {
    super(1, "[[0],[2,-3, 1],[4,-3, 1],[1,-3],[2]]", "1, 3, 10, 40", 0);
  }
}
