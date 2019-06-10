package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000027;

/**
 * A023543 Convolution of natural numbers with <code>A023533</code>.
 * @author Sean A. Irvine
 */
public class A023543 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023543() {
    super(new A000027(), new SkipSequence(new A023533(), 1));
  }
}
