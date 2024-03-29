package irvine.oeis.a307;
// Generated by gen_seq4.pl holsig/holos at 2022-09-29 21:58

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A307717 Number of palindromic squares, k^2, of length n such that k is also palindromic.
 * @author Georg Fischer
 */
public class A307717 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A307717() {
    super(1, "[0,-1,0,0,0,4,0,0,0,-6,0,0,0,4,0,0,0,-1]", "4,0,2,0,5,0,3,0,8,0,5,0,13,0,9,0,22", 0);
  }
}
