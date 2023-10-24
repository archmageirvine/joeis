package irvine.oeis.a278;
// manually A069877/simtraf at 2023-10-23 18:15

import irvine.factor.util.FactorUtils;
import irvine.oeis.a076.A076274;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A278229 Least number with the prime signature of 2*prime(n) - 1.
 * @author Georg Fischer
 */
public class A278229 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A278229() {
    super(1, new A076274().skip(1), FactorUtils::leastPrimeSignature);
  }
}
