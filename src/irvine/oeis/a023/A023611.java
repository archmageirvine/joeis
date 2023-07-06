package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a000.A000045;
import irvine.oeis.a000.A000201;

/**
 * A023611 Convolution of Fibonacci numbers and A000201.
 * @author Sean A. Irvine
 */
public class A023611 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023611() {
    super(new A000045().skip(1), new A000201());
  }
}
