package irvine.oeis.a390;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a000.A000041;
import irvine.oeis.a237.A237271;

/**
 * A390878 Convolution of A000041 and A237271.
 * @author Sean A. Irvine
 */
public class A390878 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A390878() {
    super(1, new A000041(), new A237271());
  }
}

