package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a000.A000045;

/**
 * A023596 Convolution of A023532 and Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A023596 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023596() {
    super(1, new A023532().skip(1), new A000045().skip(1));
  }
}
