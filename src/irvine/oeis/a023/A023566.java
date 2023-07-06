package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a014.A014306;

/**
 * A023566 Convolution of A023531 and A014306.
 * @author Sean A. Irvine
 */
public class A023566 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023566() {
    super(1, new A023531().skip(1), new A014306().skip(1));
  }
}
