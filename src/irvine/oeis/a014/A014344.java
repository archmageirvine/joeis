package irvine.oeis.a014;

import irvine.oeis.ConvolutionSequence;

/**
 * A014344 Four-fold convolution of primes with themselves.
 * @author Sean A. Irvine
 */
public class A014344 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A014344() {
    super(new A014342());
  }
}

