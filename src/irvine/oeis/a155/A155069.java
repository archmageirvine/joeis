package irvine.oeis.a155;
// Generated by gen_seq4.pl holos [[0],[-3,1],[9,-6],[0,1]] [1,1,2] 0 at 2020-02-15 22:07
// Recurrence: n*a[n+0]+3*(3-2*n)*a[n-1]+(n-3)*a[n-2]=0
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A155069 Expansion of <code>(3 - x - sqrt(1 - 6*x + x^2))/2</code>.
 * @author Georg Fischer
 */
public class A155069 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A155069() {
    super(0, "[[0],[-3,1],[9,-6],[0,1]]", "[1,1,2]", 0);
  }
}
