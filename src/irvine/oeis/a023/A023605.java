package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a014.A014306;

/**
 * A023605 Convolution of A023532 and A014306.
 * @author Sean A. Irvine
 */
public class A023605 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023605() {
    super(1, new A023532().skip(1), new A014306().skip(1));
  }
}
