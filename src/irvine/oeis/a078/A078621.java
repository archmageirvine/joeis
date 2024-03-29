package irvine.oeis.a078;
// Generated by gen_seq4.pl holos [0,2,-2,-1,1] [1,5,9,11,13,17,25] 0 at 2019-12-17 15:30
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A078621 Values of n such that Sum[ -(-1)^(k) n/k (n-1)/(k+1),{k,1,n}] (n!!) is an integer.
 * @author Georg Fischer
 */
public class A078621 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A078621() {
    super(1, "[0,2,-2,-1,1]", "[1,5,9,11,13,17,25]", 0);
  }
}
