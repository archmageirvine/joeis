package irvine.oeis.a030;

import irvine.oeis.transform.InverseBinomialTransformSequence;
import irvine.oeis.a008.A008578;

/**
 * A030016 Inverse binomial transform of {1, primes}.
 * @author Sean A. Irvine
 */
public class A030016 extends InverseBinomialTransformSequence {

  /** Construct the sequence. */
  public A030016() {
    super(new A008578(), 0);
  }
}
