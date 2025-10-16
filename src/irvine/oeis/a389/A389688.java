package irvine.oeis.a389;

import irvine.oeis.gf.EgfSequence;

/**
 * A388063.
 * @author Sean A. Irvine
 */
public class A389688 extends EgfSequence {

  /** Construct the sequence. */
  public A389688() {
    super(0, "exp(x*cosh(x)+x^2*sinh(x)/2)");
  }
}

