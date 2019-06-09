package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000040;

/**
 * A023606 Convolution of <code>A023532</code> and primes.
 * @author Sean A. Irvine
 */
public class A023606 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023606() {
    super(new SkipSequence(new A023532(), 1), new A000040());
  }
}
