package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a000.A000045;

/**
 * A023657 Convolution of (F(2), F(3), F(4), ...) and primes.
 * @author Sean A. Irvine
 */
public class A023657 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023657() {
    super(1, new A000040(), new A000045().skip(2));
  }
}
