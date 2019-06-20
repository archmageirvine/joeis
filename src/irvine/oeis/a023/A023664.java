package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a000.A000201;
import irvine.oeis.a001.A001950;

/**
 * A023664 Convolution of the lower and upper Wythoff sequences <code>(A000201</code> and <code>A001950)</code>.
 * @author Sean A. Irvine
 */
public class A023664 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023664() {
    super(new A000201(), new A001950());
  }
}
