package irvine.oeis.a089;

import irvine.factor.factor.LeastPrimeFactorizer;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A089948 Smallest prime factor of the concatenation of the first n odd primes.
 * @author Georg Fischer
 */
public class A089948 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A089948() {
    super(1, new A089933(), LeastPrimeFactorizer::lpf);
  }
}
