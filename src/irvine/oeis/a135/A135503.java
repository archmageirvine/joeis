package irvine.oeis.a135;
// Generated by gen_seq4.pl holos [[0,1,0,-1],[2]] [0,0] 0 at 2020-03-14 22:45
// Recurrence: 2*a[n+0]=n*(n^2-1)
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A135503 a(n) = n*(n^2 - 1)/2.
 * @author Georg Fischer
 */
public class A135503 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A135503() {
    super(0, "[[0,1,0,-1],[2]]", "[0,0]", 0);
  }
}
