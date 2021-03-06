package irvine.oeis.a308;
// Generated by gen_seq4.pl holos [0,1,-2,-1,3,1,-1,-4,3,3,-4,-1,1,3,-1,-2,1] [3,6,16,30,56,91,150,224,336,477,672,912,1233,1617,2112] 0 at 2019-12-17 15:30
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A308401 Number of bracelets (turnover necklaces) of length n that have no reflection symmetry and consist of 6 white beads and n-6 black beads.
 * @author Georg Fischer
 */
public class A308401 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A308401() {
    super(1, "[0,1,-2,-1,3,1,-1,-4,3,3,-4,-1,1,3,-1,-2,1]", "[3,6,16,30,56,91,150,224,336,477,672,912,1233,1617,2112]", 0);
  }
}
