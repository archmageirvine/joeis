package irvine.oeis.a355;
// Generated by gen_seq4.pl holsig/holos at 2022-09-29 21:58

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A355288 a(0)=1, a(1)=3, a(2)=7; thereafter a(n) = a(n-1) + a(n-2) + 1.
 * @author Georg Fischer
 */
public class A355288 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A355288() {
    super(0, "[0,-1,0,2,-1]", "1,3,7,11", 0);
  }
}
