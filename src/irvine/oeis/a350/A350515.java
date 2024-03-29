package irvine.oeis.a350;
// Generated by gen_seq4.pl holsig/holos at 2022-09-29 21:58

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A350515 a(n) = (n-1)/3 if n mod 3 = 1; a(n) = n/2 if n mod 6 = 0 or n mod 6 = 2; a(n) = (3n+1)/2 if n mod 6 = 3 or n mod 6 = 5.
 * @author Georg Fischer
 */
public class A350515 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A350515() {
    super(0, "[0,-1,0,0,0,0,0,2,0,0,0,0,0,-1]", "0,0,1,5,1,8,3,2,4,14,3,17,6", 0);
  }
}
