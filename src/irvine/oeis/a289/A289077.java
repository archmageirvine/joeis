package irvine.oeis.a289;
// Generated by gen_seq4.pl joinlr 0 0 new long[] {1L, -2L, 1L, 2L, -4L, 1L, 2L} new long[] {11L, 18L, 30L, 47L, 74L, 114L, 176L} new long[] {2L, 4L, 7L} at 2019-07-26 00:04

import irvine.oeis.recur.LinearRecurrence;

/**
 * A289077 a(n) = 2*a(n-1) + a(n-2) - 4*a(n-3) + 2*a(n-4) + a(n-5) -2*a(n-6) + a(n-7) for n &gt;= 7, a(0) = 2, a(1) = 4, a(2) = 7, a(3) = 11, a(4) = 18, a(5) = 30, a(6) = 47.
 * @author Georg Fischer
 */
public class A289077 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289077() {
    super(new long[] {1L, -2L, 1L, 2L, -4L, 1L, 2L}, new long[] {11L, 18L, 30L, 47L, 74L, 114L, 176L}, 2L, 4L, 7L);
  }
}
