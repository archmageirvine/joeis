package irvine.oeis.a081;
// manually invbinom/binomtf at 2021-12-09 12:00

import irvine.oeis.ZeroSpacedSequence;
import irvine.oeis.a005.A005046;
import irvine.oeis.transform.BinomialTransform;

/**
 * A081557 Binomial transform of expansion of exp(cosh(x)), A005046.
 * @author Georg Fischer
 */
public class A081557 extends BinomialTransform {

  /** Construct the sequence. */
  public A081557() {
    super(new ZeroSpacedSequence(new A005046(), 1));
  }
}
