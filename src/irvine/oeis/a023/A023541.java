package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a000.A000027;
import irvine.oeis.a000.A000201;

/**
 * A023541 Convolution of natural numbers with Beatty sequence for the golden mean <code>A000201</code>.
 * @author Sean A. Irvine
 */
public class A023541 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023541() {
    super(new A000027(), new A000201());
  }
}
