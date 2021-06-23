package irvine.oeis.a165;
// manually 2021-06-23

import irvine.oeis.HolonomicRecurrence;

/**
 * A165233 Signed denominators of terms in series expansion of cos(x)+sin(x).
 * E.g.f.: (1 + x)/(1 + x^2).
 * @author Georg Fischer
 */
public class A165233 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A165233() {
    super(0, "[[0],[-1],[0],[-1]]", "[1, 1]");
    setGfType(1);
  }
}
