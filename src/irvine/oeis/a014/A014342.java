package irvine.oeis.a014;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a000.A000040;

/**
 * A014342 Convolution of primes with themselves.
 * @author Sean A. Irvine
 */
public class A014342 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A014342() {
    super(1, new A000040());
  }
}

