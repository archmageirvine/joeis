package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000040;

/**
 * A023567 Convolution of A023531 and primes.
 * @author Sean A. Irvine
 */
public class A023567 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023567() {
    super(new SkipSequence(new A023531(), 1), new A000040());
  }
}
