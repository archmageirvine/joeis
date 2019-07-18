package irvine.oeis.a001;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a000.A000045;

/**
 * A001629 Self-convolution of Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A001629 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A001629() {
    super(new A000045());
  }
}
