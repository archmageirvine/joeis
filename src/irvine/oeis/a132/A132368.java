package irvine.oeis.a132;
// Generated by gen_seq4.pl holos [[0],[1],[-1],[0],[0],[0],[0],[0],[0],[-1],[1]] [0,1,2,3,6,4,5,7,8,9] 0 at 2019-12-08 00:24
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A132368 a(0), ..., a(7) are 0,1,2,3,6,4,5,7; for n &gt;= 8, a(n) = a(n-8) + 8.
 * @author Georg Fischer
 */
public class A132368 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A132368() {
    super(1, "[[0],[1],[-1],[0],[0],[0],[0],[0],[0],[-1],[1]]", "[0,1,2,3,6,4,5,7,8,9]", 0);
  }
}
