package irvine.oeis.a098;
// manually

import irvine.oeis.HolonomicRecurrence;

/**
 * A098332 Expansion of 1/sqrt(1 - 2*x + 9*x^2).
 * @author Georg Fischer
 */
public class A098332 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A098332() {
    super(0, "[[0],[-9, 9],[1,-2],[0, 1]]", "[1]", 0);
  }
}
