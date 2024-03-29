package irvine.oeis.a142;
// Generated by gen_seq4.pl holos [[0],[0,0,0,0,1],[-7,-2,-2],[1]] [0,1] 1 at 2019-12-06 18:14
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A142996 a(0) = 0, a(1) = 1, a(n+1) = (2*n^2+2*n+7)*a(n) - n^4*a(n-1), n &gt;= 1.
 * @author Georg Fischer
 */
public class A142996 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A142996() {
    super(0, "[[0],[0,0,0,0,1],[-7,-2,-2],[1]]", "[0,1]", 1);
  }
}
