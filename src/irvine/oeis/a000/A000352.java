package irvine.oeis.a000;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A000352 One half of the number of permutations of [n] such that the differences have three runs with the same signs.
 * @author Georg Fischer
 */
public class A000352 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A000352() {
    super(4, "[0, 6,-17, 17,-7, 1]", "[5, 29]", 0);
  }
}
