package irvine.oeis.a094;

import irvine.oeis.gf.GfSequence;

/**
 * A094172 Number of quasi-pentominoes in an n X n bounding box.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A094172 extends GfSequence {

  /** Construct the sequence. */
  public A094172() {
    super(0, "x^3*(x^10 +4*x^9 +25*x^8 +237*x^7 +1640*x^6 +3823*x^5 +5366*x^4 +3795*x^3 +1603*x^2 +285*x +21) / ((x+1)^4*(1-x)^9)");
  }
}
