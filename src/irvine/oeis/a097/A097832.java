package irvine.oeis.a097;
// Generated by gen_seq4.pl holos [[0],[-1],[20],[-20],[1]] [1,20,380,7201,136440] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=20*a[n-1]-20*a[n-2]+a[n-3]
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A097832 Partial sums of Chebyshev sequence S(n,19)= U(n,19/2)=A078368(n).
 * @author Georg Fischer
 */
public class A097832 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A097832() {
    super(0, "[[0],[-1],[20],[-20],[1]]", "[1,20,380,7201,136440]", 0);
  }
}
