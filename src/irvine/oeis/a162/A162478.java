package irvine.oeis.a162;
// Generated by gen_seq4.pl holos [[0],[5,-1],[-20,5],[30,-10],[-34,14],[7,-9],[0,1]] [1,2,14,88,566,3722] 0 at 2020-02-15 22:07
// Recurrence: n*a[n+0]+(7-9*n)*a[n-1]+2*(7*n-17)*a[n-2]+10*(3-n)*a[n-3]+5*(n-4)*a[n-4]+(5-n)*a[n-5]=0
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A162478 Expansion of 1/sqrt(1-4x/(1-x)^4).
 * @author Georg Fischer
 */
public class A162478 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A162478() {
    super(0, "[[0],[5,-1],[-20,5],[30,-10],[-34,14],[7,-9],[0,1]]", "[1,2,14,88,566,3722]", 0);
  }
}
