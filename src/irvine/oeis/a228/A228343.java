package irvine.oeis.a228;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A228343 The number of ordered trees with bicolored single edges on the boundary.
 * @author Georg Fischer
 */
public class A228343 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A228343() {
    super(0, "[[0],[0, 4,-8],[-12, 0, 6],[6,-1,-1]]", "1, 2, 5, 15", 0);
  }
}
