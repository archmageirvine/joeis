package irvine.oeis.a030;

import irvine.oeis.BinomialTransformSequence;
import irvine.oeis.a008.A008578;

/**
 * A030015 Binomial transform of {1, primes}.
 * @author Sean A. Irvine
 */
public class A030015 extends BinomialTransformSequence {

  /** Construct the sequence. */
  public A030015() {
    super(new A008578(), 0);
  }
}
