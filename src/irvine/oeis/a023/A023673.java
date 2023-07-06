package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a014.A014306;

/**
 * A023673 Convolution of A014306 with itself.
 * @author Sean A. Irvine
 */
public class A023673 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023673() {
    super(1, new A014306().skip(1));
  }
}
