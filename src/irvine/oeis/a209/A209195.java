package irvine.oeis.a209;

import irvine.factor.factor.LeastPrimeFactorizer;
import irvine.oeis.a097.A097942;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A209195 Smallest prime factor of the n-th highly totient number (A097942(n)) plus 1.
 * @author Georg Fischer
 */
public class A209195 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A209195() {
    super(1, new A097942(), v -> LeastPrimeFactorizer.lpf(v.add(1)));
  }
}
