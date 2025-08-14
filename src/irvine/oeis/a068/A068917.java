package irvine.oeis.a068;

import irvine.oeis.gf.GfSequence;

/**
 * A068917 Numerators of coefficients in 1/sin(x) - 1/sinh(x) power series.
 * @author Sean A. Irvine
 */
public class A068917 extends GfSequence {

  /** Construct the sequence. */
  public A068917() {
    super(0, 4, "(xcsc(x)-xcsch(x))/x^2");
  }
}

