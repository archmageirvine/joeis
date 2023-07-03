package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a000.A000201;

/**
 * A023663 Convolution of A000201 with itself.
 * @author Sean A. Irvine
 */
public class A023663 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023663() {
    super(1, new A000201());
  }
}
