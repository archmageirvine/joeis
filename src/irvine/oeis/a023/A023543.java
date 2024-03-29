package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a000.A000027;

/**
 * A023543 Convolution of natural numbers with A023533.
 * @author Sean A. Irvine
 */
public class A023543 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023543() {
    super(1, new A000027(), new A023533().skip(1));
  }
}
