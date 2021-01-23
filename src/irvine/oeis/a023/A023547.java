package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000027;

/**
 * A023547 Convolution of natural numbers &gt;= 2 and A023532.
 * @author Sean A. Irvine
 */
public class A023547 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023547() {
    super(new SkipSequence(new A000027(), 1), new SkipSequence(new A023532(), 1));
  }
}
