package irvine.oeis.a032;
// Generated by gen_seq4.pl holos [[0],[-24,16],[6,-8],[0,1]] [1,3,11] 0 at 2020-02-15 22:07
// Recurrence: n*a[n+0]+2*(-4*n+3)*a[n-1]+8*(2*n-3)*a[n-2]=0
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A032443 a(n) = Sum_{i=0..n} binomial(2*n, i).
 * @author Georg Fischer
 */
public class A032443 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A032443() {
    super(0, "[[0],[-24,16],[6,-8],[0,1]]", "[1,3,11]", 0);
  }
}
