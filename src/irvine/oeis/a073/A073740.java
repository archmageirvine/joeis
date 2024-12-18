package irvine.oeis.a073;

import irvine.oeis.ConvolutionSequence;

/**
 * A073740 Self-convolution of A073739; odd-indexed terms are twice the odd primes.
 * @author Sean A. Irvine
 */
public class A073740 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A073740() {
    super(0, new A073739());
  }
}
