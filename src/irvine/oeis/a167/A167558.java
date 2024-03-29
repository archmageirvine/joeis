package irvine.oeis.a167;
// Generated by gen_seq4.pl holos [[0],[24,-28,8],[5,-2]] [1,12] 0 at 2020-03-14 22:45
// Recurrence: (-2*n+5)*a[n+0]+4*(2*n-3)*(n-2)*a[n-1]=0
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A167558 The second right hand column of triangle A167557.
 * @author Georg Fischer
 */
public class A167558 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A167558() {
    super(2, "[[0],[24,-28,8],[5,-2]]", "[1,12]", 0);
  }
}
