package irvine.oeis.a135;

import irvine.oeis.gf.GfSequence;

/**
 * A135647 Expansion of the generating function 1 / ((25*x^10+49*x-1) * (x^10+2*x-1)^3 * (x^10+x-1)^6).
 * @author Sean A. Irvine
 */
public class A135647 extends GfSequence {

  /** Construct the sequence. */
  public A135647() {
    super(0, "1/((25*x^10+49*x-1)*(x^10+2*x-1)^3*(x^10+x-1)^6)");
  }
}

