package irvine.oeis.a319;
// Generated by gen_seq4.pl holos [0,-1,1,1,1] [0,-1,2] 0 at 2019-12-17 15:30
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A319200 a(n) = -(A(n) - A(n-1)) where A(n) = A057597(n+1), for n &gt;= 0.
 * @author Georg Fischer
 */
public class A319200 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A319200() {
    super(1, "[0,-1,1,1,1]", "[0,-1,2]", 0);
  }
}
