package irvine.oeis.a316;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A316729 Generalized 30-gonal (or triacontagonal) numbers: m*(14*m - 13) with m = 0, +1, -1, +2, -2, +3, -3, ... 
 * @author Georg Fischer
 */
public class A316729 extends LinearRecurrence {

  /** Construct the sequence. */
  public A316729() {
    super(new long[] {1L, -1L, -2L, 2L, 1L}, new long[] {0L, 1L, 27L, 30L, 82L});
  } // constructor()
} // A316729
