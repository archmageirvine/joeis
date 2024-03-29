package irvine.oeis.a354;
// Generated by gen_seq4.pl holsig/holos at 2022-09-29 21:58

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A354595 a(n) = n^2 + 4*floor(n/2)^2.
 * @author Georg Fischer
 */
public class A354595 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A354595() {
    super(0, "[0,1,-1,-2,2,1,-1]", "0,1,8,13,32,41", 0);
  }
}
