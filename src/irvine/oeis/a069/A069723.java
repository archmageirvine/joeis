package irvine.oeis.a069;
// Generated by gen_seq4.pl holos [[0],[-12,8],[1,-1]] [1,2] 0 at 2019-12-08 00:24
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A069723 a(n) = 2^(n-1)*binomial(2*n-3, n-1).
 * @author Georg Fischer
 */
public class A069723 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A069723() {
    super(1, "[[0],[-12,8],[1,-1]]", "[1,2]", 0);
  }
}
