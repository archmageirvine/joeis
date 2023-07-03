package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000027;

/**
 * A023536 Convolution of natural numbers with A023532.
 * @author Sean A. Irvine
 */
public class A023536 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023536() {
    super(1, new A000027(), new SkipSequence(new A023532(), 1));
  }
}
