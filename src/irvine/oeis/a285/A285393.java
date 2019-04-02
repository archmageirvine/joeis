package irvine.oeis.a285;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A285393 Start with a single cell at coordinates (0, 0, 0), then iteratively subdivide the grid into 3 X 3 X 3 cells and remove the cells whose sum of modulo 2 coordinates is 2 or 3; a(n) is the number of cells after n iterations. 
 * @author Georg Fischer
 */
public class A285393 extends LinearRecurrence {

  /** Construct the sequence. */
  public A285393() {
    super(new long[] {-48L, 20L}, new long[] {1L, 20L});
  } // constructor()
} // A285393
