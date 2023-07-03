package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000204;

/**
 * A023558 Convolution of A023531 and Lucas numbers.
 * @author Sean A. Irvine
 */
public class A023558 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023558() {
    super(1, new SkipSequence(new A023531(), 1), new A000204());
  }
}
