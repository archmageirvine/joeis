package irvine.oeis.a235;
// manually

import irvine.oeis.HolonomicRecurrence;

/**
 * A235933 Numbers coprime to 35.
 * @author Georg Fischer
 */
public class A235933 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A235933() {
    super(1, "[0,-1, 0, 1, 1, 0,-1,-1, 0, 1, 1, 0,-1,-1, 0, 1, 1, 0,-1,-1, 0, 1, 1, 0,-1]",
        "[1, 2, 3, 4, 6, 8, 9, 11, 12, 13, 16, 17, 18, 19, 22, 23, 24, 26, 27, 29, 31, 32, 33, 34, 36, 37, 38]", 0);
  }
}
