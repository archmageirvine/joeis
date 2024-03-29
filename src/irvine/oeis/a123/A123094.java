package irvine.oeis.a123;
// Generated by gen_seq4.pl holos [[0,691,0,-4550,0,9009,0,-8580,0,5005,0,-2730,-1365,-210],[2730]] [0,1] 0 at 2020-03-14 22:45
// Recurrence: 2730*a[n+0]=n*(n+1)*(2*n+1)*(105*n^10+525*n^9+525*n^8-1050*n^7-1190*n^6+2310*n^5+1420*n^4-3285*n^3-287*n^2+2073*n-691)
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A123094 Sum of first n 12th powers.
 * @author Georg Fischer
 */
public class A123094 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A123094() {
    super(0, "[[0,691,0,-4550,0,9009,0,-8580,0,5005,0,-2730,-1365,-210],[2730]]", "[0,1]", 0);
  }
}
