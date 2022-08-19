package irvine.oeis.a005;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A005691 Number of Twopins positions.
 * @author Georg Fischer
 */
public class A005691 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A005691() {
    super(6, "[0, 1, 0, 0, 0, 0, 2,-2, 0,-1, 2, 0,-2, 1]", "[1, 2, 3, 5, 7, 10, 13, 18, 24, 35, 50, 75]", 0);
  }
}
