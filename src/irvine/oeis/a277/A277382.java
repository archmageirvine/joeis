package irvine.oeis.a277;
// Generated by gen_seq4.pl holos [[0],[1,-2,1],[-2,-2],[1]] [1,4,23,168] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=2*(n+1)*a[n-1]-(n-1)^2*a[n-2]
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A277382 a(n) = n!*LaguerreL(n, -3).
 * @author Georg Fischer
 */
public class A277382 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A277382() {
    super(0, "[[0],[1,-2,1],[-2,-2],[1]]", "[1,4,23,168]", 0);
  }
}
