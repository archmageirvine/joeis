package irvine.oeis.a337;
// Generated by gen_seq4.pl holos at 2021-06-02 19:27
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A337842 The smallest palindrome with exactly n circular loops (or holes) in its decimal representation.
 * Lin.rec. signature: (0, 0, 0, 111, 0, 0, 0,-1110, 0, 0, 0, 1000)
 * @author Georg Fischer
 */
public class A337842 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A337842() {
    super(0, "[0, 1000, 0, 0, 0,-1110, 0, 0, 0, 111, 0, 0, 0,-1]", "1, 0, 8, 606, 88, 808, 888, 68086, 8888, 88088, 88888, 6880886, 888888, 8880888, 8888888, 688808886, 88888888, 888808888", 0);
  }
}
