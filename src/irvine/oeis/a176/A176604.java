package irvine.oeis.a176;
// Generated by gen_seq4.pl holos [[0,0],[40,-8],[-96,24],[82,-29],[-29,19],[2,-7],[1,1]] [1,0,1,3,7] 0 at 2020-01-24 16:04
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A176604 Sequence defined by the recurrence formula a(n+1) = Sum_{n&gt;=1}(a(p)*a(n-p) + k, p=0..n) + j, with a(0) = 1, a(1) = 0, k = 0 and j = 1.
 * @author Georg Fischer
 */
public class A176604 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A176604() {
    super(0, "[[0,0],[40,-8],[-96,24],[82,-29],[-29,19],[2,-7],[1,1]]", "[1,0,1,3,7]", 0);
  }
}
