package irvine.oeis.a098;
// Generated by gen_seq4.pl holos [[0],[19,-19],[1,-2],[0,1]] [1,1,11,31] 0 at 2020-03-14 22:45
// Recurrence: n*a[n+0]+(1-2*n)*a[n-1]+19*(1-n)*a[n-2]=0
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A098264 G.f.: 1/(1-2x-19x^2)^(1/2).
 * @author Georg Fischer
 */
public class A098264 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A098264() {
    super(0, "[[0],[19,-19],[1,-2],[0,1]]", "[1,1,11,31]", 0);
  }
}
