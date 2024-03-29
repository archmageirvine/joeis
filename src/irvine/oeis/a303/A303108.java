package irvine.oeis.a303;
// Generated by gen_seq4.pl holos [[0],[6,-7,2],[3,-3],[1]] [2,5,24] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=3*(n-1)*a[n-1]-(2*n-3)*(n-2)*a[n-2]
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A303108 a(n) = (2*n-1)*a(n-1) - (n-2)!, with a(1) = 2, n &gt; 1.
 * @author Georg Fischer
 */
public class A303108 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A303108() {
    super(1, "[[0],[6,-7,2],[3,-3],[1]]", "[2,5,24]", 0);
  }
}
