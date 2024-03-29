package irvine.oeis.a332;
// Generated by gen_seq4.pl holos [[0],[-1000],[1110],[-111],[1]] [4,747,77477,7774777,777747777] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=111*a[n-1]-1110*a[n-2]+1000*a[n-3]
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A332174 a(n) = 7*(10^(2n+1)-1)/9 - 3*10^n.
 * @author Georg Fischer
 */
public class A332174 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A332174() {
    super(0, "[[0],[-1000],[1110],[-111],[1]]", "[4,747,77477,7774777,777747777]", 0);
  }
}
