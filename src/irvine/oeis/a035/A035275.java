package irvine.oeis.a035;
// Generated by gen_seq4.pl holos [[0],[4,-10],[1]] [1] 0 at 2020-02-15 22:07
// Recurrence: a[n]-(10*n-4)*a[n-1]=0
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A035275 One sixth of deca-factorial numbers.
 * @author Georg Fischer
 */
public class A035275 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A035275() {
    super(1, "[[0],[4,-10],[1]]", "[1]", 0);
  }
}
