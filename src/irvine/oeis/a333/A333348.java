package irvine.oeis.a333;
// manually

import irvine.oeis.HolonomicRecurrence;

/**
 * A333348 Matching number of the tree of n vertices with the largest number of maximum matchings.
 * @author Georg Fischer
 */
public class A333348 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A333348() {
    super(0, "[0,-1, 1, 0, 0, 0, 0, 0, 1,-1]", 
        "[0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 7, 7, 7, 8, 8, 8, 8]", 0);
  }
}
