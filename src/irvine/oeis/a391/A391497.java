package irvine.oeis.a391;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FilterSequence;
import irvine.oeis.a362.A362148;

/**
 * A391497 Biquadratefree numbers that are neither cubefree nor cubefull.
 * @author Sean A. Irvine
 */
public class A391497 extends FilterSequence {

  /** Construct the sequence. */
  public A391497() {
    super(1, new A362148(), k -> Jaguar.factor(k).maxExponent() < 4);
  }
}
