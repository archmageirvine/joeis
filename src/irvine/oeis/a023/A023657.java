package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a000.A000045;

/**
 * A023657 Convolution of <code>(F(2), F(3), F(4), ...)</code> and primes.
 * @author Sean A. Irvine
 */
public class A023657 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023657() {
    super(new A000040(), new SkipSequence(new A000045(), 2));
  }
}
