package irvine.oeis.a332;
// Generated by gen_seq4.pl holos [[0],[-1000],[1110],[-111],[1]] [2,323,33233,3332333,333323333] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=111*a[n-1]-1110*a[n-2]+1000*a[n-3]
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A332132 a(n) = (10^(2n+1)-1)/3 - 10^n.
 * @author Georg Fischer
 */
public class A332132 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A332132() {
    super(0, "[[0],[-1000],[1110],[-111],[1]]", "[2,323,33233,3332333,333323333]", 0);
  }
}
