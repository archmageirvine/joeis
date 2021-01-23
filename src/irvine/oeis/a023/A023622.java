package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a000.A000204;
import irvine.oeis.a001.A001950;

/**
 * A023622 Convolution of Lucas numbers and A001950.
 * @author Sean A. Irvine
 */
public class A023622 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023622() {
    super(new A000204(), new A001950());
  }
}
