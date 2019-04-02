package irvine.oeis.a014;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a000.A000110;

/**
 * A014322 Convolution of Bell numbers with themselves.
 * @author Sean A. Irvine
 */
public class A014322 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A014322() {
    super(new A000110());
  }
}

