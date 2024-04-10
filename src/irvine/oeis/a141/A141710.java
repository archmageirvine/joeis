package irvine.oeis.a141;

import irvine.factor.factor.LeastPrimeFactorizer;
import irvine.oeis.a002.A002997;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A141710 Least prime factor of n-th Carmichael number A002997(n).
 * @author Georg Fischer
 */
public class A141710 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A141710() {
    super(1, new A002997(), LeastPrimeFactorizer::lpf);
  }
}
