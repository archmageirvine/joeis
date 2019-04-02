package irvine.oeis.a006;

import irvine.oeis.ExponentialConvolutionSequence;
import irvine.oeis.a000.A000055;

/**
 * A006771 Exponential self-convolution of numbers of trees on n nodes.
 * @author Sean A. Irvine
 */
public class A006771 extends ExponentialConvolutionSequence {

  /** Construct the sequence. */
  public A006771() {
    super(new A000055());
  }
}
