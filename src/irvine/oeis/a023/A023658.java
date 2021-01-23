package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a000.A000201;
import irvine.oeis.a005.A005408;

/**
 * A023658 Convolution of odd numbers and A000201.
 * @author Sean A. Irvine
 */
public class A023658 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023658() {
    super(new A005408(), new A000201());
  }
}
