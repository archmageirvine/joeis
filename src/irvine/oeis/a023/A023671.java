package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a014.A014306;

/**
 * A023671 Convolution of <code>A023533</code> and <code>A014306</code>.
 * @author Sean A. Irvine
 */
public class A023671 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023671() {
    super(new SkipSequence(new A023533(), 1), new SkipSequence(new A014306(), 1));
  }
}
