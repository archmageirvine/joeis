package irvine.oeis.a141;
// Generated by gen_seq4.pl holos [0,-1,-2,-1,1] [1,1,3,5] 0 at 2019-12-17 15:30
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A141685 a(1) = 1, a(n) = Sum_{k=1..n} (k mod 3) * a(n-k) for n &gt;= 2.
 * @author Georg Fischer
 */
public class A141685 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A141685() {
    super(1, "[0,-1,-2,-1,1]", "[1,1,3,5]", 0);
  }
}
