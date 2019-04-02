package irvine.oeis.a014;

import irvine.oeis.ConvolutionSequence;

/**
 * A014325 Four-fold convolution of Bell numbers with themselves.
 * @author Sean A. Irvine
 */
public class A014325 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A014325() {
    super(new A014322());
  }
}

