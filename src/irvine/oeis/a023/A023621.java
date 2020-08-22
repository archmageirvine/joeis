package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a000.A000201;
import irvine.oeis.a000.A000204;

/**
 * A023621 Convolution of Lucas numbers and A000201.
 * @author Sean A. Irvine
 */
public class A023621 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023621() {
    super(new A000204(), new A000201());
  }
}
