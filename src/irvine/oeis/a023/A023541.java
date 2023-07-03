package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a000.A000027;
import irvine.oeis.a000.A000201;

/**
 * A023541 Convolution of natural numbers with Beatty sequence for the golden mean A000201.
 * @author Sean A. Irvine
 */
public class A023541 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023541() {
    super(1, new A000027(), new A000201());
  }
}
