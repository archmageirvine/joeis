package irvine.oeis.a278;

import irvine.factor.util.FactorUtils;
import irvine.oeis.a001.A001045;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A278165 Least number with the prime signature of the n-th Jacobsthal number.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A278165 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A278165() {
    super(1, new A001045().skip(), FactorUtils::leastPrimeSignature);
  }
}
