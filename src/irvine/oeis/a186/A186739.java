package irvine.oeis.a186;
// Generated by gen_seq4.pl holos [[-1],[2,-1],[-1],[1]] [0,0] 0 at 2019-12-06 18:14
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A186739 a(0)=0, a(1)=0; for n&gt;1, a(n) = a(n-1) + (n-2)*a(n-2) + 1.
 * @author Georg Fischer
 */
public class A186739 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A186739() {
    super(0, "[[-1],[2,-1],[-1],[1]]", "[0,0]", 0);
  }
}
