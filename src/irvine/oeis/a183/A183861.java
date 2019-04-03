package irvine.oeis.a183;
// Generated by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A183861 n-1+ceiling((-1+n^2)/3); complement of A183860. 
 * @author Georg Fischer
 */
public class A183861 extends LinearRecurrence {

  /** Construct the sequence. */
  public A183861() {
    super(new long[] {1L, -2L, 1L, -1L, 2L}, new long[] {2L, 5L, 8L, 12L, 17L}, new long[] {1L});
  } // constructor()
} // A183861
