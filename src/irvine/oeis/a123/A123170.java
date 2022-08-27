package irvine.oeis.a123;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A123170 Continued fraction for (sqrt(2)+1/sqrt(2))*tanh(1/sqrt(2)).
 * @author Georg Fischer
 */
public class A123170 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A123170() {
    super(1, "[[0],[-1],[0],[0],[0],[0],[0],[0],[0],[0],[0],[2],[0],[0],[0],[0],[0],[0],[0],[0],[0],[-1]]", "1, 3, 2, 3, 21, 6, 33, 8, 1, 2, 4, 1, 2, 11, 57, 14, 69, 16, 1, 2, 8, 1", 0);
  }
}
