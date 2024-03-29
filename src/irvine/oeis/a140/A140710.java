package irvine.oeis.a140;
// Generated by gen_seq4.pl dfinite/holos at 2022-07-29 23:34

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A140710 Number of maximal initial consecutive columns ending at the same level, summed over all deco polyominoes of height n.
 * @author Georg Fischer
 */
public class A140710 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A140710() {
    super(1, "[[0],[4,-2],[0, 3],[-3,-1],[1]]", "1, 3, 10, 38", 0);
  }
}
