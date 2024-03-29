package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a000.A000045;

/**
 * A023613 Convolution of Fibonacci numbers and A023533.
 * @author Sean A. Irvine
 */
public class A023613 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023613() {
    super(new A000045().skip(1), new A023533().skip(1));
  }
}
