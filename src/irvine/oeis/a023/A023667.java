package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a001.A001950;

/**
 * A023667 Convolution of A001950 with itself.
 * @author Sean A. Irvine
 */
public class A023667 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023667() {
    super(new A001950());
  }
}
