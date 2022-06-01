package irvine.oeis.a098;
// manually

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A098335 Expansion of 1/sqrt(1-4x+8x^2).
 * @author Georg Fischer
 */
public class A098335 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A098335() {
    super(0, "[[0],[-8, 8],[2,-4],[0, 1]]", "[1]", 0);
  }
}
