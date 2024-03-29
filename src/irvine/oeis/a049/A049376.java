package irvine.oeis.a049;
// Generated by gen_seq4.pl holos [[0],[0,-2,-3,-1],[6,9,3],[-7,-3],[1]] [1,1,4,22,154] 3 at 2020-03-14 22:45
// Recurrence: a[n+3]-(3*n+7)*a[n+2]+3*(n+1)*(n+2)*a[n+1]-n*(n+1)*(n+2)*a[n+0]=0
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A049376 Row sums of triangle A046089.
 * @author Georg Fischer
 */
public class A049376 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A049376() {
    super(0, "[[0],[0,-2,-3,-1],[6,9,3],[-7,-3],[1]]", "[1,1,4,22,154]", 3);
  }
}
