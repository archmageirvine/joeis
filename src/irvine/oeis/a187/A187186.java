package irvine.oeis.a187;
// manually

import irvine.oeis.HolonomicRecurrence;

/**
 * A187186 Parse the infinite string 0123456701234567012345670... into distinct phrases 0, 1, 2, 3, 4, 5, 6, 7, 01, 23, 45, 67, 012, 34, ...; a(n) = length of n-th phrase.
 * @author Georg Fischer
 */
public class A187186 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A187186() {
    super(1, 
       "[0, 1,-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,-1, 1]", 
       "[1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4, 5, 4, 4, 5, 4, 4, 5, 4, 4, 5, 5, 5, 5, 5, 6, 6, 6, 6, 7, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 8, 9, 8, 9, 8, 9, 8, 9, 8, 9, 8, 9, 8, 9, 8, 9, 10, 10, 10, 10, 11, 10, 10, 10, 10, 11, 11, 11, 11, 11, 11, 11]", 0);
  }
}
