package irvine.oeis.a014;

import irvine.oeis.gf.EgfSequence;

/**
 * A014479 Exponential generating function = (1+2*x)/(1-2*x)^3.
 * @author Sean A. Irvine
 */
public class A014479 extends EgfSequence {

  /** Construct the sequence. */
  public A014479() {
    super(0, "(1+2*x)/(1-2*x)^3");
  }
}
