package irvine.oeis.a330;
// Generated by gen_seq4.pl holos [[0],[-1],[0],[3],[0],[-3],[0],[1]] [1,6,9,42,17,110,25] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=3*a[n-2]-3*a[n-4]+a[n-6]
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A330983 Alternatively add and multiply pairs of the nonnegative integers.
 * @author Georg Fischer
 */
public class A330983 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A330983() {
    super(1, "[[0],[-1],[0],[3],[0],[-3],[0],[1]]", "[1,6,9,42,17,110,25]", 0);
  }
}
