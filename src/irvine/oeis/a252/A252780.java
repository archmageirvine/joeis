package irvine.oeis.a252;
// Generated by gen_seq4.pl holos [[0,852,-3288,6120,-9309,11280,-6288,-1164,1696,648,-486,-96,0,36,0,0,-1],[1]] [0,0] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=n*(n-1)*(n^14+n^13+n^12-35*n^11-35*n^10+61*n^9+547*n^8-101*n^7-1797*n^6-633*n^5+5655*n^4-5625*n^3+3684*n^2-2436*n+852)
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A252780 Number of ways of n-coloring the square grid graph G_(4,4) such that no rectangle exists with sides parallel to the axes having all 4 corners of the same color.
 * @author Georg Fischer
 */
public class A252780 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A252780() {
    super(0, "[[0,852,-3288,6120,-9309,11280,-6288,-1164,1696,648,-486,-96,0,36,0,0,-1],[1]]", "[0,0]", 0);
  }
}
