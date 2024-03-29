package irvine.oeis.a332;
// Generated by gen_seq4.pl holos [[0],[-1000],[1110],[-111],[1]] [3,535,55355,5553555,555535555] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=111*a[n-1]-1110*a[n-2]+1000*a[n-3]
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A332153 a(n) = 5*(10^(2*n+1)-1)/9 - 2*10^n.
 * @author Georg Fischer
 */
public class A332153 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A332153() {
    super(0, "[[0],[-1000],[1110],[-111],[1]]", "[3,535,55355,5553555,555535555]", 0);
  }
}
