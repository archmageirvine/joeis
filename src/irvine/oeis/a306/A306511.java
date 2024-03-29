package irvine.oeis.a306;
// Generated by gen_seq4.pl 2023-12-02/holos at 2023-12-03 21:34

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A306511 Number of permutations p of [n] having at least one index i with |p(i)-i| = 1.
 * @author Georg Fischer
 */
public class A306511 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A306511() {
    super(0, "[[0],[-28, 27,-9, 1],[71,-102, 53,-12, 1],[26,-27, 9,-1],[-28, 55,-36, 10,-1],[-28, 40,-16, 2],[-13, 7,-1]]", "0, 0, 1, 4, 19", 0);
  }
}
