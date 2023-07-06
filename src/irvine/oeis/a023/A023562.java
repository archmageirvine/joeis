package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a005.A005408;

/**
 * A023562 Convolution of A023531 and odd numbers.
 * @author Sean A. Irvine
 */
public class A023562 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023562() {
    super(1, new A023531().skip(1), new A005408());
  }
}
