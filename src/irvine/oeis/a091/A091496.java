package irvine.oeis.a091;
// Generated by gen_seq4.pl holos [[0],[-3780,30000,-65000,50000,-12500],[0],[0,-3,11,-12,4]] [1,16,630] 0 at 2020-03-14 22:45
// Recurrence: n*(n-1)*(2*n-1)*(2*n-3)*a[n+0]=20*(5*n-1)*(5*n-3)*(5*n-7)*(5*n-9)*a[n-2]
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A091496 a(n) = ((5*n)!/(n!*(2*n)!))*(Gamma(1+n/2)/Gamma(1+5*n/2)).
 * @author Georg Fischer
 */
public class A091496 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A091496() {
    super(0, "[[0],[-3780,30000,-65000,50000,-12500],[0],[0,-3,11,-12,4]]", "[1,16,630]", 0);
  }
}
