package irvine.oeis.a305;
// Generated by gen_seq4.pl holos [[0],[30,-27],[0,1]] [1,-3] 0 at 2020-02-15 22:07
// Recurrence: n*a[n+0]+3*(-9*n+10)*a[n-1]=0
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A305991 Expansion of (1-27*x)^(1/9).
 * @author Georg Fischer
 */
public class A305991 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A305991() {
    super(0, "[[0],[30,-27],[0,1]]", "[1,-3]", 0);
  }
}
