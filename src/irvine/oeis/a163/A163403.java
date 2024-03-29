package irvine.oeis.a163;
// Generated by gen_seq4.pl holos [[0],[-2],[0],[1]] [1,2,2] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=2*a[n-2]
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A163403 a(n) = 2*a(n-2) for n &gt; 2; a(1) = 1, a(2) = 2.
 * @author Georg Fischer
 */
public class A163403 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A163403() {
    super(1, "[[0],[-2],[0],[1]]", "[1,2,2]", 0);
  }
}
