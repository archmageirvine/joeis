package irvine.oeis.a316;
// Generated by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A316724 Generalized 26-gonal (or icosihexagonal) numbers: m*(12*m - 11) with m = 0, +1, -1, +2, -2, +3, -3, ... 
 * @author Georg Fischer
 */
public class A316724 extends LinearRecurrence {

  /** Construct the sequence. */
  public A316724() {
    super(new long[] {1L, -1L, -2L, 2L, 1L}, new long[] {0L, 1L, 23L, 26L, 70L});
  } // constructor()
} // A316724
