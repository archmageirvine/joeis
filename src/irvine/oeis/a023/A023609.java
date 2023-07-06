package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a000.A000045;
import irvine.oeis.a002.A002808;

/**
 * A023609 Convolution of Fibonacci numbers and composite numbers.
 * @author Sean A. Irvine
 */
public class A023609 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023609() {
    super(new A000045().skip(1), new A002808());
  }
}
