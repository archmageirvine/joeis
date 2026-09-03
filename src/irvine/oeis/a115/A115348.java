package irvine.oeis.a115;

import irvine.oeis.gf.GfSequence;

/**
 * A115348 Five-coordinate renormalization of A_5 to pentadentate D_2 polynomial as a coefficient expansion.
 * @author Sean A. Irvine
 */
public class A115348 extends GfSequence {

  /** Construct the sequence. */
  public A115348() {
    super(0, "(16384)*(1+228*x^5+494*x^10-228*x^15+x^20)^3/((x^2-1)^20 * (1-11*x^5-x^10)^5)");
  }
}

