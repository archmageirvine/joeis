package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a000.A000045;
import irvine.oeis.a014.A014306;

/**
 * A023614 Convolution of Fibonacci numbers and A014306.
 * @author Sean A. Irvine
 */
public class A023614 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023614() {
    super(new A000045().skip(1), new A014306().skip(1));
  }
}
