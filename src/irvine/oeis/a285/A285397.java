package irvine.oeis.a285;

import irvine.oeis.LinearRecurrence;

/**
 * A285397 Start with a single cell at coordinates <code>(0, 0, 0)</code>, then iteratively subdivide the grid into 3 X 3 X 3 cells and remove the cells whose sum of modulo 2 coordinates is <code>3; a(n)</code> is the number of cells after n iterations.
 * @author Sean A. Irvine
 */
public class A285397 extends LinearRecurrence {

  /** Construct the sequence. */
  public A285397() {
    super(new long[] {216, -195, 32}, new long[] {1, 26, 646});
  }
}
