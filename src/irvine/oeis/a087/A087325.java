package irvine.oeis.a087;

import irvine.factor.util.FactorUtils;
import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A087325 Numbers k such that k and its 10's complement both have the same prime signature.
 * @author Sean A. Irvine
 */
public class A087325 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A087325() {
    super(1, k -> FactorUtils.leastPrimeSignature(k).equals(FactorUtils.leastPrimeSignature(Functions.TENS_COMPLEMENT.l(k))));
  }
}

