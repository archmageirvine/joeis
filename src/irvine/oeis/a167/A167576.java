package irvine.oeis.a167;
// manually 2021-10-17

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A167576 The first column of the ED3 array A167572. 
 * @author Georg Fischer
 */
public class A167576 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A167576() {
    super(1, "[[0],[15,-16, 4],[4],[-1]]", "[1, 5]", 0);
  }
}
