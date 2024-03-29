package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a002.A002808;

/**
 * A023599 Convolution of A023532 and composite numbers.
 * @author Sean A. Irvine
 */
public class A023599 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023599() {
    super(1, new A023532().skip(1), new A002808());
  }
}
