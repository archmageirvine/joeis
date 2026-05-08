package irvine.oeis.a395;

import irvine.oeis.gf.EgfSequence;

/**
 * A084726.
 * @author Sean A. Irvine
 */
public class A395672 extends EgfSequence {

  /** Construct the sequence. */
  public A395672() {
    super(0, "exp(-(x+(3/2)*x^2))*(1-exp(-(17/6)*x^3)) / (1+LambertW(-x))");
  }
}
