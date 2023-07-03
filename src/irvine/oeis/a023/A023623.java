package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000204;

/**
 * A023623 Convolution of Lucas numbers and A023533.
 * @author Sean A. Irvine
 */
public class A023623 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023623() {
    super(1, new A000204(), new SkipSequence(new A023533(), 1));
  }
}
