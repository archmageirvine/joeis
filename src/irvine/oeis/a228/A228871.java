package irvine.oeis.a228;
// Generated by gen_seq4.pl holsig/holos at 2022-09-29 21:58

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A228871 Odd numbers producing 3 out-of-order odd numbers in the Collatz (3x+1) iteration.
 * @author Georg Fischer
 */
public class A228871 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A228871() {
    super(1, "[0,-64,65,-1]", "3,227,14563", 0);
  }
}
