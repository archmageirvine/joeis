package irvine.oeis.a007;

import irvine.oeis.a000.A000040;
import irvine.oeis.transform.InverseBinomialTransformSequence;

/**
 * A007442 Inverse binomial transform of primes.
 * @author Sean A. Irvine
 */
public class A007442 extends InverseBinomialTransformSequence {

  /** Construct the sequence. */
  public A007442() {
    super(1, new A000040(), 0);
  }
}
