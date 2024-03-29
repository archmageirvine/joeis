package irvine.oeis.a180;
// Generated by gen_seq4.pl dfinite/holos at 2022-07-29 23:34

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A180189 Number of permutations of [n] having exactly 1 circular succession. A circular succession in a permutation p of [n] is either a pair p(i), p(i+1), where p(i+1)=p(i)+1 or the pair p(n), p(1) if p(1)=p(n)+1.
 * @author Georg Fischer
 */
public class A180189 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A180189() {
    super(1, "[[0],[0,-1, 1],[0,-3, 1],[2,-1]]", "0, 2, 0", 0);
  }
}
