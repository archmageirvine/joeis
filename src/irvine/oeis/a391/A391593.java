package irvine.oeis.a391;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FilterSequence;

/**
 * A391593 Cubefull numbers that are neither biquadratefree nor biquadratefull.
 * @author Sean A. Irvine
 */
public class A391593 extends FilterSequence {

  /** Construct the sequence. */
  public A391593() {
    super(1, new A391115(), k -> Jaguar.factor(k).minExponent() >= 3);
  }
}
