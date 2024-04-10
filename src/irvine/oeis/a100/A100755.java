package irvine.oeis.a100;

import irvine.factor.factor.LeastPrimeFactorizer;
import irvine.oeis.a003.A003590;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A100755 Smallest prime factor of the concatenation of terms in the n-th row of Pascal&apos;s Triangle.
 * @author Georg Fischer
 */
public class A100755 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A100755() {
    super(1, new A003590().skip(1), LeastPrimeFactorizer::lpf);
  }
}
