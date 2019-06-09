package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a002.A002808;

/**
 * A023648 Self-convolution of composite numbers.
 * @author Sean A. Irvine
 */
public class A023648 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023648() {
    super(new A002808());
  }
}
