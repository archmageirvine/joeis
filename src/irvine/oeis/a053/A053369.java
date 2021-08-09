package irvine.oeis.a053;
// manually 2021-07-06

import irvine.oeis.HolonomicRecurrence;

/**
 * A053369 Linear recursion with Catalan numbers.
 * @author Georg Fischer
 */
public class A053369 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A053369() {
    super(0, "[[0],[4, 6,-28],[-5, 2, 7]]", "2", 0);
  }
}
