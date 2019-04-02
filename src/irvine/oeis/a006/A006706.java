package irvine.oeis.a006;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a000.A000055;

/**
 * A006706 Self-convolution of numbers of trees on n nodes.
 * @author Sean A. Irvine
 */
public class A006706 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A006706() {
    super(new A000055());
  }
}
