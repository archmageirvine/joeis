package irvine.oeis.a120;
// Generated by gen_seq4.pl holos [0,-1,5,-10,10,-5,1] [256,1280,3840,8960,17920] 0 at 2019-12-17 15:30
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A120054 a(n) = binomial(n+3,4)*4^4.
 * @author Georg Fischer
 */
public class A120054 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A120054() {
    super(1, "[0,-1,5,-10,10,-5,1]", "[256,1280,3840,8960,17920]", 0);
  }
}
