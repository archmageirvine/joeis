package irvine.oeis.a306;
// Generated by gen_seq4.pl holos [[0],[-2,1],[-1],[0,-1],[1]] [0,2,4,14,56] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=n*a[n-1]+a[n-2]-(n-2)*a[n-3]
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A306150 Row sums of A306015.
 * @author Georg Fischer
 */
public class A306150 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A306150() {
    super(0, "[[0],[-2,1],[-1],[0,-1],[1]]", "[0,2,4,14,56]", 0);
  }
}
