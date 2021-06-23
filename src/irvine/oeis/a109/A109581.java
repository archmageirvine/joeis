package irvine.oeis.a109;
// manually 2021-06-23

import irvine.oeis.HolonomicRecurrence;

/**
 * A109581 E.g.f.: x/(1+x-x^3).
 * @author Georg Fischer
 */
public class A109581 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A109581() {
    super(0, "[[0],[1],[0],[-1],[-1]]", "[0, 1,-2, 6]");
    setGfType(1);
  }
}
