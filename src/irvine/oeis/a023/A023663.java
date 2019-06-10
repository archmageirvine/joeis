package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a000.A000201;

/**
 * A023663 Convolution of <code>A000201</code> with itself.
 * @author Sean A. Irvine
 */
public class A023663 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023663() {
    super(new A000201());
  }
}
