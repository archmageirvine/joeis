package irvine.oeis.a352;
// Generated by gen_seq4.pl holsig/holos at 2022-09-29 21:58

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A352692 a(n) + a(n+1) = 2^n for n &gt;= 0 with a(0) = 4.
 * @author Georg Fischer
 */
public class A352692 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A352692() {
    super(0, "[0,2,1,-1]", "4,-3,5", 0);
  }
}
