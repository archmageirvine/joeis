package irvine.oeis.a097;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A097602 a(n+1) = a(n) + number of squares so far; a(1) = 1. 
 * @author Georg Fischer
 */
public class A097602 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097602() {
    super(new long[] {1L, -2L, 1L, 0L, 0L, 0L, 0L, 0L, 0L, -1L, 2L}, new long[] {1L, 2L, 3L, 4L, 6L, 8L, 10L, 12L, 14L, 16L, 19L});
  } // constructor()
} // A097602
