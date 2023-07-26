package irvine.oeis.a278;
// manually A069877/parmof2 at 2023-07-26 12:08

import irvine.factor.util.FactorUtils;
import irvine.oeis.a005.A005940;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A278222 The least number with the same prime signature as A005940(n+1).
 * @author Georg Fischer
 */
public class A278222 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A278222() {
    super(0, new A005940(), FactorUtils::leastPrimeSignature);
  }
}
