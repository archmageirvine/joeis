package irvine.oeis.a206;
// Generated by gen_seq4.pl holos [[0],[0,-2,-4],[-5,-10,-4],[1]] [0,6] 0 at 2019-12-06 18:14
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A206307 a(n) = ((2*n+2)*(2*n+3) - 1)*a(n-1) + 2*n*(2*n+1)*a(n-2), a(0)=0, a(1)=6.
 * @author Georg Fischer
 */
public class A206307 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A206307() {
    super(0, "[[0],[0,-2,-4],[-5,-10,-4],[1]]", "[0,6]", 0);
  }
}
