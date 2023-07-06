package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a001.A001950;
import irvine.oeis.a014.A014306;

/**
 * A023669 Convolution of A001950 and A014306.
 * @author Sean A. Irvine
 */
public class A023669 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023669() {
    super(1, new A001950(), new A014306().skip(1));
  }
}
