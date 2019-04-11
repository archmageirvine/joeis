package irvine.oeis.a320;
// Generated by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A320259 Terms that are on the y-axis of the square spiral built with <code>2*k, 2*k+1, 2*k+1</code> for <code>k &gt;= 0</code>.
 * @author Georg Fischer
 */
public class A320259 extends LinearRecurrence {

  /** Construct the sequence. */
  public A320259() {
    super(new long[] {1L, -2L, 1L, -1L, 2L}, new long[] {0L, 2L, 5L, 9L, 15L});
  } // constructor()
} // A320259
