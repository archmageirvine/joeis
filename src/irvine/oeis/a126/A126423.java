package irvine.oeis.a126;
// Generated by gen_seq4.pl holos [[1,1,0,0,-1],[1]] [-1] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=n^4-n-1
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A126423 a(n) = n^4 - n - 1.
 * @author Georg Fischer
 */
public class A126423 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A126423() {
    super(1, "[[1,1,0,0,-1],[1]]", "[-1]", 0);
  }
}
