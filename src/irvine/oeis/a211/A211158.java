package irvine.oeis.a211;
// Generated by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A211158 Number of 2 X 2 matrices having all terms in <code>{-n,...,0,..,n}</code> and positive odd determinant.
 * @author Georg Fischer
 */
public class A211158 extends LinearRecurrence {

  /** Construct the sequence. */
  public A211158() {
    super(new long[] {1L, -1L, -4L, 4L, 6L, -6L, -4L, 4L, 1L}, new long[] {20L, 84L, 528L, 1040L, 3060L, 4788L, 10304L, 14400L, 26100L});
  } // constructor()
} // A211158
