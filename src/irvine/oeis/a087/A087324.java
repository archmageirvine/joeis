package irvine.oeis.a087;

import irvine.factor.util.FactorUtils;
import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A087324 Numbers n such that n and its 9's complement both have the same prime signature.
 * @author Sean A. Irvine
 */
public class A087324 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A087324() {
    super(1, k -> FactorUtils.leastPrimeSignature(k).equals(FactorUtils.leastPrimeSignature(Functions.TENS_COMPLEMENT.l(k) - 1)));
  }
}

