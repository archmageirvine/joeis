package irvine.oeis.a006;

import irvine.oeis.ExponentialConvolutionSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000081;

/**
 * A006850 Exponential self-convolution of numbers of rooted trees on n nodes.
 * @author Sean A. Irvine
 */
public class A006850 extends ExponentialConvolutionSequence {

  /** Construct the sequence. */
  public A006850() {
    super(new SkipSequence(new A000081(), 1));
  }
}
