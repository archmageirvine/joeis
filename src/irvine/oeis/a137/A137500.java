package irvine.oeis.a137;
// Generated by gen_seq4.pl holos [[0],[-6],[8],[-5],[1]] [0,0,1,5,17] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=5*a[n-1]-8*a[n-2]+6*a[n-3]
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A137500 Binomial transform of b(n) = (0, 0, A007910).
 * @author Georg Fischer
 */
public class A137500 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A137500() {
    super(0, "[[0],[-6],[8],[-5],[1]]", "[0,0,1,5,17]", 0);
  }
}
