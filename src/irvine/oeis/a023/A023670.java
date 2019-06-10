package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.SkipSequence;

/**
 * A023670 Convolution of <code>A023533</code> with itself.
 * @author Sean A. Irvine
 */
public class A023670 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023670() {
    super(new SkipSequence(new A023533(), 1));
  }
}
