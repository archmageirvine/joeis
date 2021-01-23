package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000027;

/**
 * A023535 Convolution of natural numbers with A023531.
 * @author Sean A. Irvine
 */
public class A023535 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023535() {
    super(new A000027(), new SkipSequence(new A023531(), 1));
  }
}
