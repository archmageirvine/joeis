package irvine.oeis.a195;
// Generated by gen_seq4.pl holos [[0],[-4,2],[-1,-1],[1]] [1,2,6] 0 at 2019-12-06 18:14
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A195254 O.g.f.: Sum_{n&gt;=0} 2*(n+2)^(n-1)*x^n/(1+n*x)^n.
 * @author Georg Fischer
 */
public class A195254 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A195254() {
    super(0, "[[0],[-4,2],[-1,-1],[1]]", "[1,2,6]", 0);
  }
}
