package irvine.oeis.a087;

import irvine.oeis.gf.GfSequence;

/**
 * A087483 Row 0 of the order array of 3/2, i.e., row 0 of the transposable dispersion in A087465.
 * @author Sean A. Irvine
 */
public class A087483 extends GfSequence {

  /** Construct the sequence. */
  public A087483() {
    super(0, "(x^4-x^3+x^2+1) / ((1-x)^3*(x^2+x+1))");
  }
}
