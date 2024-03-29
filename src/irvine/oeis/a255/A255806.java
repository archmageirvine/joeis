package irvine.oeis.a255;
// Generated by gen_seq4.pl holos [[0],[2,-3,1],[-1,-2],[1]] [1,3,15,99] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=(2*n+1)*a[n-1]-(n-2)*(n-1)*a[n-2]
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A255806 Expansion of e.g.f.: exp(Sum_{k&gt;=1} 3*x^k).
 * @author Georg Fischer
 */
public class A255806 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A255806() {
    super(0, "[[0],[2,-3,1],[-1,-2],[1]]", "[1,3,15,99]", 0);
  }
}
