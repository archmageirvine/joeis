package irvine.oeis.a047;
// Generated by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A047878 <code>a(n)=least</code> number of knight's moves from corner <code>(0,0)</code> to n-th diagonal of unbounded chessboard.
 * @author Georg Fischer
 */
public class A047878 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047878() {
    super(new long[] {-1L, 1L, 0L, 1L}, new long[] {2L, 1L, 2L, 3L}, new long[] {0L, 3L});
  } // constructor()
} // A047878
