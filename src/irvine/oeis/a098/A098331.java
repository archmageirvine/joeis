package irvine.oeis.a098;
// manually

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A098331 Expansion of 1/sqrt(1 - 2*x + 5*x^2).
 * @author Georg Fischer
 */
public class A098331 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A098331() {
    super(0, "[[0],[-5, 5],[1,-2],[0, 1]]", "[1]", 0);
  }
}
