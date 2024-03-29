package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a000.A000040;

/**
 * A023606 Convolution of A023532 and primes.
 * @author Sean A. Irvine
 */
public class A023606 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023606() {
    super(1, new A023532().skip(1), new A000040());
  }
}
