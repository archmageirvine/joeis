package irvine.oeis.a029;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A029747 Numbers of the form 2^k times 1, 3 or 5.
 * @author Georg Fischer
 */
public class A029747 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A029747() {
    super(1, "[0,-2, 0, 0, 1]", "[1, 2, 3, 4, 5]", 0);
  }
}
