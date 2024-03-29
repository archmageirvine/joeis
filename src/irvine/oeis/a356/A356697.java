package irvine.oeis.a356;
// Generated by gen_seq4.pl holsig/holos at 2022-09-30 21:25

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A356697 Number of Catalan words of length n avoiding the pattern 0000.
 * @author Georg Fischer
 */
public class A356697 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A356697() {
    super(0, "[0,1,-6,-7,9,3,1,-1]", "1,1,2,5,13,36,101,280", 0);
  }
}
