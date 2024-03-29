package irvine.oeis.a332;
// Generated by gen_seq4.pl holos [[0],[-1000],[1110],[-111],[1]] [7,878,88788,8887888,888878888] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=111*a[n-1]-1110*a[n-2]+1000*a[n-3]
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A332187 a(n) = 8*(10^(2n+1)-1)/9 - 10^n.
 * @author Georg Fischer
 */
public class A332187 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A332187() {
    super(0, "[[0],[-1000],[1110],[-111],[1]]", "[7,878,88788,8887888,888878888]", 0);
  }
}
