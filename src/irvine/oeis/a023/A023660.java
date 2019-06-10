package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a005.A005408;

/**
 * A023660 Convolution of odd numbers and <code>A023533</code>.
 * @author Sean A. Irvine
 */
public class A023660 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023660() {
    super(new A005408(), new SkipSequence(new A023533(), 1));
  }
}
