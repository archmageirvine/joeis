package irvine.oeis.a352;
// Generated by gen_seq4.pl holsig/holos at 2022-09-29 21:58

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A352795 Number of ways to tile a 4 X n strip with squares and L-shaped heptominoes with legs of equal length.
 * @author Georg Fischer
 */
public class A352795 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A352795() {
    super(0, "[0,2,2,2,4,0,0,1,-1]", "1,1,1,1,5,11,19,29", 0);
  }
}
