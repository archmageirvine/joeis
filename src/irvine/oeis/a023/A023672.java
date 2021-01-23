package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000040;

/**
 * A023672 Convolution of A023533 and primes.
 * @author Sean A. Irvine
 */
public class A023672 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023672() {
    super(new SkipSequence(new A023533(), 1), new A000040());
  }
}
