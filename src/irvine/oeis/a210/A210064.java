package irvine.oeis.a210;
// Generated by gen_seq4.pl holos at 2021-06-07 19:33
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A210064 Total number of 231 patterns in the set of permutations avoiding 123.
 * radtorec(1/2*x/(1-4*x)^2+1/2*(x-1)/(1-4*x)^(3/2)+1/(2-8*x))
 * @author Georg Fischer
 */
public class A210064 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A210064() {
    super(1, "[[0],[-24, 40,-16],[4,-22, 8],[0, 3,-1]]", "0, 0, 1, 11, 81, 500, 2794, 14649", 0);
  }
}
