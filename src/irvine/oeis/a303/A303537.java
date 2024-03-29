package irvine.oeis.a303;
// Generated by gen_seq4.pl holos [[0],[32,-16],[-2],[0,1]] [1,2,2,12] 0 at 2020-03-14 22:45
// Recurrence: n*a[n+0]=2*a[n-1]+4^2*(n-2)*a[n-2]
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A303537 Expansion of ((1 + 4*x)/(1 - 4*x))^(1/4).
 * @author Georg Fischer
 */
public class A303537 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A303537() {
    super(0, "[[0],[32,-16],[-2],[0,1]]", "[1,2,2,12]", 0);
  }
}
