package irvine.oeis.a162;
// Generated by gen_seq4.pl holos [[0],[6,-13,2],[-27,40,-8],[33,-42,12],[-15,32,-16],[-3,-1,2]] [1,2,8,39,205,1136] 0 at 2020-03-14 22:45
// Recurrence: (n+1)*(2*n-3)*a[n+0]-(4*n-3)*(4*n-5)*a[n-1]+3*(4*n^2-14*n+11)*a[n-2]+(-8*n^2+40*n-27)*a[n-3]+(2*n-1)*(n-6)*a[n-4]=0
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A162476 Expansion of (1/(1-x))*c(x/(1-x)^4), c(x) the g.f. of A000108.
 * @author Georg Fischer
 */
public class A162476 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A162476() {
    super(0, "[[0],[6,-13,2],[-27,40,-8],[33,-42,12],[-15,32,-16],[-3,-1,2]]", "[1,2,8,39,205,1136]", 0);
  }
}
