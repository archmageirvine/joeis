package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a000.A000027;

/**
 * A023547 Convolution of natural numbers &gt;= 2 and A023532.
 * @author Sean A. Irvine
 */
public class A023547 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023547() {
    super(1, new A000027().skip(1), new A023532().skip(1));
  }
}
