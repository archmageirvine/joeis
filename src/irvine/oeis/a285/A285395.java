package irvine.oeis.a285;
// Generated by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.recur.LinearRecurrence;

/**
 * A285395 Start with a single cell at coordinates (0, 0, 0), then iteratively subdivide the grid into 3 X 3 X 3 cells and remove the cells whose sum of modulo 2 coordinates is 1; a(n) is the number of cells after n iterations.
 * @author Georg Fischer
 */
public class A285395 extends LinearRecurrence {

  /** Construct the sequence. */
  public A285395() {
    super(new long[] {324L, -195L, 28L}, new long[] {1L, 15L, 249L});
  } // constructor()
} // A285395
