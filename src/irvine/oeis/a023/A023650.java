package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a002.A002808;
import irvine.oeis.a005.A005408;

/**
 * A023650 Convolution of composite numbers and odd numbers.
 * @author Sean A. Irvine
 */
public class A023650 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023650() {
    super(new A002808(), new A005408());
  }
}
