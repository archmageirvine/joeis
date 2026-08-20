package irvine.oeis.a135;

import irvine.oeis.gf.GfSequence;

/**
 * A135649 Expansion of 1 / ((x^7+x-1)^3 * (x^7+2*x-1)^2 * (x^7+3*x-1) * (23*x^7+49*x-1)).
 * @author Sean A. Irvine
 */
public class A135649 extends GfSequence {

  /** Construct the sequence. */
  public A135649() {
    super(0, "1/((x^7+x-1)^3*(x^7+2*x-1)^2*(x^7+3*x-1)*(23*x^7+49*x-1))");
  }
}
