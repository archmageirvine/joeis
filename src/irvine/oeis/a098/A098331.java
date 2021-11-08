package irvine.oeis.a098;
// manually

import irvine.oeis.HolonomicRecurrence;

/**
 * A098331 Expansion of 1/sqrt(1-2x+5x^2).
 * @author Georg Fischer
 */
public class A098331 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A098331() {
    super(0, "[[0],[-5, 5],[1,-2],[0, 1]]", "[1]", 0);
  }
}
