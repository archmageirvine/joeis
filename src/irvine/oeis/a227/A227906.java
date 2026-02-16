package irvine.oeis.a227;

import irvine.oeis.gf.GfSequence;

/**
 * A227906 Coins left after packing heart patterns (fixed orientation) into n X n coins.
 * @author Sean A. Irvine
 */
public class A227906 extends GfSequence {

  /** Construct the sequence. */
  public A227906() {
    super(0, "(x+2*x^2+3*x^3)/(1-2*x^2+x^4)");
  }
}

