package irvine.oeis.a135;

import irvine.oeis.gf.GfSequence;

/**
 * A135647 G.f. = 1/(x^36*p(1/x)) where p(x)=(- 25 - 49 x^9 + x^10)*(- 1 - 2 x^9 + x^10)^3*(- 1 - x^9 + x^10)^6.
 * @author Sean A. Irvine
 */
public class A135647 extends GfSequence {

  /** Construct the sequence. */
  public A135647() {
    super(0, "1/((25*x^10+49*x-1)*(x^10+2*x-1)^3*(x^10+x-1)^6)");
  }
}

