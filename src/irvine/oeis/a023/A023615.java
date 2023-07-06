package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a000.A000045;

/**
 * A023615 Convolution of Fibonacci numbers and primes.
 * @author Sean A. Irvine
 */
public class A023615 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023615() {
    super(new A000045().skip(1), new A000040());
  }
}
