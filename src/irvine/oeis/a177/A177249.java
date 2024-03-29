package irvine.oeis.a177;
// Generated by gen_seq4.pl dfinite/holos at 2022-07-29 23:34

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A177249 Number of permutations of [n] having no adjacent transpositions, that is, no cycles of the form (i, i+1).
 * @author Georg Fischer
 */
public class A177249 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A177249() {
    super(0, "[[0],[-1],[2,-1],[0],[0,-1],[1]]", "1, 1, 1, 4, 19", 0);
  }
}
