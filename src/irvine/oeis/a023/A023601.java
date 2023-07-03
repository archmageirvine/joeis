package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a005.A005408;

/**
 * A023601 Convolution of A023532 and odd numbers.
 * @author Sean A. Irvine
 */
public class A023601 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023601() {
    super(1, new SkipSequence(new A023532(), 1), new A005408());
  }
}
