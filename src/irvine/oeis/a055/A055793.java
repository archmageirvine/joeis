package irvine.oeis.a055;
// Generated by gen_seq4.pl holos [0,-1,15,-15,1] [0,1,4,49] 0 at 2019-12-17 15:30
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A055793 Numbers k such that k and floor[k/3] are both squares; i.e., squares which remain squares when written in base 3 and last digit is removed.
 * @author Georg Fischer
 */
public class A055793 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A055793() {
    super(1, "[0,-1,15,-15,1]", "[0,1,4,49]", 0);
  }
}
