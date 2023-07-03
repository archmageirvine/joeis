package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a014.A014306;

/**
 * A023671 Convolution of A023533 and A014306.
 * @author Sean A. Irvine
 */
public class A023671 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023671() {
    super(1, new SkipSequence(new A023533(), 1), new SkipSequence(new A014306(), 1));
  }
}
