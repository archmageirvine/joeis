package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a000.A000027;

/**
 * A023535 Convolution of natural numbers with A023531.
 * @author Sean A. Irvine
 */
public class A023535 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023535() {
    super(1, new A000027(), new A023531().skip(1));
  }
}
