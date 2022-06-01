package irvine.oeis.a285;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A285391 Start with a single cell at coordinates (0, 0), then iteratively subdivide the grid into 3 X 3 cells and remove the cells whose sum of modulo 2 coordinates is 2; a(n) is the number of cells after n iterations.
 * @author Sean A. Irvine
 */
public class A285391 extends LinearRecurrence {

  /** Construct the sequence. */
  public A285391() {
    super(new long[] {-12, 9}, new long[] {1, 8});
  }
}
